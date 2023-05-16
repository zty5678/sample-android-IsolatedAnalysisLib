package com.example.lib_umeng

import android.content.Context
import android.util.Log
import com.example.base.LogUtils
import com.example.lib_analysis_base.AnalysisUtils
import com.example.lib_analysis_base.EventType

class UmengUtils : AnalysisUtils() {
    private val TAG = "UmengUtils"
    override fun init(context: Context) {

    }

    override fun onEvent(event: EventType) {
        LogUtils.d("event=$event")
    }
}