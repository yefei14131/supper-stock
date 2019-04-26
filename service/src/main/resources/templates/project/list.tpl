<#include "../common/header.tpl">

<div class="layui-body">
    <!-- 内容主体区域 -->
    <div class="layui-btn-container" style="padding: 15px 0px 0px 5px">
        <a class="layui-btn" href="/project/edit.html">新增项目</a>
        <a class="layui-btn" href="javascript:reloadAllK8s()">重启所有k8s服务</a>
        <a class="layui-btn" href="javascript:syncK8sStatus()">同步k8s状态</a>
        <a class="layui-btn" href="javascript:syncApmStatus()">同步APM状态</a>
        <a class="layui-btn" href="javascript:syncJenkinsStatus()">同步Jenkins状态</a>
        <a class="layui-btn" href="javascript:buildAllJenkins()">重新构建所有Jenkins</a>
        <a class="layui-btn layui-btn-primary total-records" href="javascript:void(0);">总记录数：</a>
    </div>
    <div style="/* padding: 15px; */" id="item-list"  lay-filter='project-list'></div>
</div>


<script>

    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#item-list'
            ,url:'/project/${method}.ajax'
            ,method:"post"
            ,contentType : "application/json"
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [[
                {field:'serviceName', title: '服务名', width:'180'},
                {field:'jenkinsJobName', title: 'jenkinsJobName', width:'180', edit:'text'},
                {field:'serviceDescribe', title: '服务描述', width:'180'},
                {field:'business', title: '业务领域', width:'128'},
                {field:'needDeploy', title: '需要部署', width:'88', edit:'text'},
                {field:'jenkinsStatus', title: 'jenkins状态', width:'110'},
                {field:'k8sStatus', title: 'k8s服务状态', width:'110'},
                {field:'apmStatus', title: '探针状态', width:'90'},
                {field:'apmAgent', title: 'agent', width:'180'},
                {field:'remark', title: '备注', width:'180', edit:'text'},
                {fixed: 'right', align:'center', toolbar: '#barDemo', title:'管理', width:'415'} //这里的toolbar值是模板元素的选择器

            ]]
            ,parseData : function (res) {
                var data = {
                    "code": res.code, //解析接口状态
                    "msg": res.message, //解析提示文本
                    "count": res.data.total, //解析数据长度
                    "data": res.data.list //解析数据列表
                };

                $(".total-records").text('总记录数：'+ res.data.total)

                return data;
            }
        });


        table.on('edit(project-list)', function(obj){ //注：edit是固定事件名，test是table原始容器的属性 lay-filter="对应的值"
            console.log(obj.value); //得到修改后的值
            console.log(obj.field); //当前编辑的字段名
            console.log(obj.data); //当前编辑的字段名

            if (obj.field == 'needDeploy' && ['true', 'false'].indexOf(obj.value) == -1){
                layer.msg('值只能是"true"或者"false"')
                return;
            }

            ajaxPost('/project/save.ajax', obj.data,function(response) {
                layer.msg("保存成功")

            })
        });

    });


    function buildAllJenkins () {
        msg = "确定要重新构建所有Jenkins?"
        layer.confirm(msg, function(index){

            ajaxPost('/project/buildJenkins.ajax', {}, function(response) {
                layer.msg( "操作成功！当前操作比较耗时，请耐心等待，不要重复操作！")
            })
            layer.close(index);
        })
    }


    function buildJenkins(jenkinsJobName){
        layer.msg("当前操作比较耗时，请耐心等待，不要重复操作！")
        ajaxPost('/project/buildJenkins.ajax', !!jenkinsJobName ? {jenkinsJobName:jenkinsJobName} : {}, function(response) {
            layer.msg(response.message ? response.message : "操作成功！")
        })

        return false;
    }


    function getJenkinsStatus(jenkinsJobName){
        layer.msg("当前操作比较耗时，请耐心等待，不要重复操作！")
        ajaxPost('/project/getJenkinsStatus.ajax', {jenkinsJobName:jenkinsJobName}, function(response) {
            layer.msg(response.message, {time: 5000, area:['500px']})
        })

        return false;
    }


    function syncJenkinsStatus(){
        ajaxPost('/project/syncJenkinsStatus.ajax', {},function(response) {
            layer.msg("操作成功！当前操作比较耗时，请耐心等待，不要重复操作！")

        })

        return false;
    }


    function syncApmStatus(){
        ajaxPost('/project/syncApmStatus.ajax', {},function(response) {
            layer.msg("同步完成")
            setTimeout(function () {
                location.reload();
            },2000)
        })

        return false;
    }

    function syncK8sStatus(){
        ajaxPost('/project/syncK8sStatus.ajax', {},function(response) {
            layer.msg("操作成功！当前操作比较耗时，请耐心等待，不要重复操作！")
        })

        return false;
    }

    function deleteItem(id, name){
        msg = "确定要删除<span style='color:red'>" + name + "</span>?"
        layer.confirm(msg, function(index){
            ajaxPost('/project/delete.ajax', {ID:id},function(response) {
                location.reload();
            })
            layer.close(index);
        })
    }

    function reloadK8s(jenkinsJobName, name){
        msg = "确定要重启K8s:<span style='color:red'>" + name + "</span>?"

        layer.confirm(msg, function(index){
            ajaxPost('/project/reloadK8s.ajax', {jenkinsJobName:jenkinsJobName}, function(response) {
                // location.reload();
                layer.msg("已执行操作")
            })
            layer.close(index);
        })
    }


    function reloadAllK8s(){
        msg = "确定要重启:<span style='color:red'>所有K8s服务</span>?"

        layer.confirm(msg, function(index){
            ajaxPost('/project/reloadAllK8s.ajax', {}, function(response) {
                // location.reload();
                layer.msg("已执行操作")
            })
            layer.close(index);
        })
    }


    function getK8sStatus(jenkinsJobName){
        ajaxPost('/project/getK8sStatus.ajax', {jenkinsJobName:jenkinsJobName}, function(response) {
            layer.msg(response.message, {time: 5000, area:['500px']})
        })

        return false;
    }


    function reloadAllFailK8s(jenkinsJobName){
        msg = "确定要重启<span style='color:red'>所有无活跃探针的服务</span>?"

        layer.confirm(msg, function(index){
            ajaxPost('/project/reloadK8s.ajax', {jenkinsJobName:jenkinsJobName},function(response) {
                layer.msg("已执行操作")
            })
            layer.close(index);
        })
    }





</script>

    <script type="text/html" id="barDemo">

        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="javascript:deleteItem({{d.id}}, '{{ d.serviceDescribe.replace(/["\']/g, "")}}');">删除</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit"  href="javascript:reloadK8s('{{d.jenkinsJobName}}', '{{ d.serviceDescribe.replace(/["\']/g, "")}}');">重启k8s</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit"  href="javascript:getK8sStatus('{{d.jenkinsJobName}}', '{{ d.serviceDescribe.replace(/["\']/g, "")}}');">获取k8s状态</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit"  href="javascript:buildJenkins('{{d.jenkinsJobName}}', '{{ d.serviceDescribe.replace(/["\']/g, "")}}');">构建Jenkins</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit"  href="javascript:getJenkinsStatus('{{d.jenkinsJobName}}', '{{ d.serviceDescribe.replace(/["\']/g, "")}}');">获取Jenkins日志</a>

        <!-- 这里同样支持 laytpl 语法，如： -->

    </script>




<#include "../common/footer.tpl">