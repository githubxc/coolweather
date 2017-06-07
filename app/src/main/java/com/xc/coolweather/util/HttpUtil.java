package com.xc.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by XC on 2017/6/7.
 */

public class HttpUtil {

    //数据请求

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(address).build();
            client.newCall(request).enqueue(callback);
    }
}
