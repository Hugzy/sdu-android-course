package com.android.l3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeLongToast("Everything seems to work", this)
    }

    fun goToExercise1(view: View){
        makeLongToast("Opening exercise 1...", this)
    }

    fun goToExercise2(view: View){
        makeLongToast("Opening exercise 2...", this)
    }
}
