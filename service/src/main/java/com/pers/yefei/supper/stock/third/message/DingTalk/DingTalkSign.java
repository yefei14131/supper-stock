package com.pers.yefei.supper.stock.third.message.DingTalk;

import com.pers.yefei.supper.stock.exception.DingTalkSignException;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * @author yefei
 * @date: 2019/12/15
 */
public class DingTalkSign {
    static String genSign(String token, String secret, Long timestamp) {
        try {
            String stringToSign = timestamp + "\n" + secret;
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            return URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");
        } catch (Exception e) {
            throw new DingTalkSignException(e);
        }
    }
}
