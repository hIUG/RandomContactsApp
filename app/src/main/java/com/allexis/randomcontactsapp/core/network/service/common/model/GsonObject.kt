package com.allexis.randomcontactsapp.core.network.service.common.model

import android.util.Log

import com.google.gson.Gson

/**
 * Created by allexis on 10/30/17.
 */

open class GsonObject {

    companion object {

        private val TAG = GsonObject::class.java.simpleName

        fun <T : GsonObject> fromJsonString(json: String, classOf: Class<T>): T {
            return Gson().fromJson(json, classOf)
        }
    }

    fun toJsonString(): String {
        var jsonString = ""
        try {
            jsonString = Gson().toJson(this)
        } catch (e: Exception) {
            Log.e(TAG, "toJsonString: Unexpected exception when serializing to JSON", e)
        }

        return jsonString
    }
}
