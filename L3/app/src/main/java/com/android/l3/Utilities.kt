package com.android.l3

import android.content.Context
import android.widget.Toast

fun makeLongToast(msg: String, context: Context){
    val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
    toast.show()
}

fun makeShortToast(msg: String, context: Context){
    val toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT)
    toast.show()
}