package com.example.myapplication

import android.app.Application
import android.util.Log
import com.example.base.LogUtils

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        LogUtils.d("onCreate")
    }


}