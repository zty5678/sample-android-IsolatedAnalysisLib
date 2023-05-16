package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.base.LogUtils
import com.example.lib_analysis_base.AnalysisUtils
import com.example.lib_analysis_base.EventType



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtv_market = findViewById<TextView>(R.id.txtv_market);
        txtv_market.text = "market type=${BuildConfig.MARKET}"

        LogUtils.d("onCreate: market type=${BuildConfig.MARKET}")
        AnalysisUtils.instance?.init(this)
        AnalysisUtils.instance?.onEvent(EventType.LOGIN)

    }
}