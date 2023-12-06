package com.example.sto

import android.app.Application
import android.content.Context
import com.example.sto.utils.sdkinit.XBasicLibInit


class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initLibs()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    private fun initLibs() {
        XBasicLibInit.init(this)
    }

    companion object {
        val isDebug: Boolean
            get() = true
        val onTrade: Int
            get() = 5
    }
}