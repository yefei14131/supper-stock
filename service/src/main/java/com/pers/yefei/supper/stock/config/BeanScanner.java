package com.pers.yefei.supper.stock.config;

//import com.sun.istack.internal.Nullable;
import lombok.Data;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: yefei
 * @date: 2018/10/10 18:59
 */
@Component
public class BeanScanner {

    private HashMap<String, List<BeanField>> beanMap;

    public List<BeanField> getBeanFields(String classSimpleName) {

        if (classSimpleName == null) {
            return null;
        }
        if (beanMap == null) {
            try {
                updateMethodResponseMap();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        return beanMap.get(classSimpleName);
    }



    public List<BeanField> getBeanFields(String classSimpleName, String... exceptFieldNames) {

        List<BeanField> beanFields = getBeanFields(classSimpleName);

        if (exceptFieldNames.length == 0 || beanFields == null){
            return beanFields;
        }

        return beanFields.stream().filter(
                    beanField -> !Arrays.asList(exceptFieldNames).contains(beanField.getFieldName())).collect(Collectors.toList()
                );

    }



    @Data
    public class BeanField {
        private String fieldName;
        private String fieldType;

        BeanField(String fieldName, String fieldType){
            this.fieldName = fieldName;
            this.fieldType = fieldType;
        }
    }


    public class ClassNameFilter implements TypeFilter {
        @Override
        public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
            return true;
        }
    }

    private synchronized void updateMethodResponseMap() throws Exception {
        beanMap = new HashMap();
        ClassPathScanningCandidateComponentProvider scanner =
                new ClassPathScanningCandidateComponentProvider(false);

        scanner.addIncludeFilter(new ClassNameFilter());

        for (BeanDefinition bd : scanner.findCandidateComponents("com.hualala.qa.k8s.op.model.gen.pojo")) {

            Class aClass = Class.forName(bd.getBeanClassName());
            String simpleName = aClass.getSimpleName();

            List<BeanField> beanFields = new ArrayList<>();

            Arrays.stream(aClass.getDeclaredFields()).forEach(field -> {
                String fieldName = field.getName();
                Class<?> fieldType = field.getType();
                String fieldTypeName = fieldType.getSimpleName();

                beanFields.add(new BeanField(fieldName, fieldTypeName));
            });
            beanMap.put(simpleName, beanFields);
        }

    }

    public static void main(String[] args) {
        BeanScanner beanScanner = new BeanScanner();
        List<BeanField> beanFields = beanScanner.getBeanFields("TblSystemConfig", "configID", "updateTime");
        System.out.println(beanFields);
    }

}
