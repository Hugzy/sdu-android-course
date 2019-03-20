package com.android.lecture2

import android.content.Context
import android.widget.Toast

fun makeToast(context: Context, text: String){
    val toast = Toast.makeText(context, text, Toast.LENGTH_LONG)
    toast.show()
}