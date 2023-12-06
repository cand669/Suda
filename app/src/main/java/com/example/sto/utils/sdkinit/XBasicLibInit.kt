package com.example.sto.utils.sdkinit

import android.app.Application
import com.example.sto.MyApp
import com.xuexiang.xhttp2.XHttpSDK

object XBasicLibInit {
    fun init(application: Application) {
        initXHttp2(application)
    }
    private fun initXHttp2(application: Application) {
        XHttpSDK.init(application)
        if (MyApp.isDebug) {
            XHttpSDK.debug()
        }
//        XHttpSDK.debug(new CustomLoggingInterceptor());
        XHttpSDK.setBaseUrl("https://gitee.com/")
//        XHttpSDK.addInterceptor(new CustomDynamicInterceptor());
//        XHttpSDK.addInterceptor(new CustomExpiredInterceptor());
    }
}