package com.example.lib_analysis_base

import android.content.Context

enum class EventType {
    LOGIN
}

abstract class AnalysisUtils {

    companion object {
        var instance: AnalysisUtils? = null

    }

    abstract fun init(context: Context)

    abstract fun onEvent(event: EventType)
}