package com.example.lib_umeng

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.util.Log
import com.example.base.LogUtils
import com.example.lib_analysis_base.AnalysisUtils

class MyProviderForUmeng: ContentProvider() {
    private val TAG = "MyProviderForUmeng"
    override fun onCreate(): Boolean {
        LogUtils.d(TAG, "onCreate: ")
        AnalysisUtils.instance = UmengUtils()

        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {

        return null
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        return 0
    }
}