package com.example.lib_firebase

import android.content.Context
import com.example.base.LogUtils
import com.example.lib_analysis_base.AnalysisUtils
import com.example.lib_analysis_base.EventType

class FirebaseUtils : AnalysisUtils(){
    override fun init(context: Context) {

    }

    override fun onEvent(event: EventType) {
        LogUtils.d("event=$event")
    }
}