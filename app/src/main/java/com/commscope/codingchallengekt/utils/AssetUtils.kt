package com.commscope.codingchallengekt.utils

import android.content.Context
import java.io.IOException

fun loadStringFromAsset(context: Context, fileName: String): String {
    try {
        return context.assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return ""
}