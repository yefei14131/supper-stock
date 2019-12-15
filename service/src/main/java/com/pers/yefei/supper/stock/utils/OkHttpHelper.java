package com.pers.yefei.supper.stock.utils;

import okhttp3.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Component
public class OkHttpHelper {

    final static int timeout = 60;
    private static OkHttpClient okHttpClient;

    @PostConstruct
    public void init(){
        ConnectionPool connectionPool = new ConnectionPool(10, 10, TimeUnit.MINUTES);
        okHttpClient = new OkHttpClient.Builder()
                .readTimeout(timeout, TimeUnit.SECONDS)
                .connectionPool(connectionPool)
                .build();
    }


    public byte[] getResponseByte(String url) throws IOException {

        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);

        Response response = call.execute();
        byte[] bytes = response.body().bytes();
        response.close();
        return bytes;

    }


    public int getResponseCode(String url) {
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);

        try {
            Response response = call.execute();
            int code = response.code();
            response.close();

            return code;
        } catch (IOException e) {
           return 0;
        }
    }

    public String getResponseString(String url) throws IOException {
        byte[] responseByte = this.getResponseByte(url);

        return new String(responseByte);
    }

    public String getResponseString(String url, String charset) throws IOException {
        byte[] responseByte = this.getResponseByte(url);

        return new String(responseByte, charset);
    }

    public int connectionCount(){
        return okHttpClient.connectionPool().connectionCount();
    }

}
