package com.pers.yefei.supper.stock.model.bean.MessageObserver;

import lombok.Data;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class MessageBaseObserver {

    protected String thirdToken;
    protected String title;
    protected String memo;
    protected String messagePushType;

}
