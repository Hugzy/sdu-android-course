package com.android.lecture2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, CollectNameActivity::class.java)
        startActivity(intent)

    }

    override fun onStart() {
        super.onStart()
        Log.d("--- START --- ", "On start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("--- RESUME --- ", "On resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("--- PAUSE --- ", "On pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("--- STOP --- ", "On stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("--- DESTROY --- ", "On destroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("--- RESTART --- ", "On restart called")
    }
}
