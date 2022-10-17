package com.commscope.codingchallengekt.utils

import android.app.AlertDialog
import android.content.Context

fun showDialog(context: Context, message: String) {
    AlertDialog.Builder(context).apply {
        setTitle(message)
        setPositiveButton("OK", null)
    }.show()
}