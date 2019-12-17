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

    private static HashMap<String, String> secretMap = new HashMap<String, String>();
    static {
        secretMap.put("20e0f97ec78da7a0eeeae5a541682bf189a3d0975ccfe71a4bf7058cbd0f8deb", "SEC2307f422fe5c15f3ba5f9492ce48bb1fe16f76ec909267bf9790bc392c4e0103");
    }

    public static String genSign(String token, Long timestamp) {
        try {
            String secret = secretMap.get(token);
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
