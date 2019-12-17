package com.pers.yefei.supper.stock.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Slf4j
public class RandomSleep {

    public static void sleep(long minMS, long maxMS) {
        try{
            Thread.sleep(RandomUtils.nextLong(minMS, maxMS));
        } catch (Exception e) {
            log.error("random sleep error", e);

        }
    }
}
