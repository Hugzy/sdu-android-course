package com.android.lecture2

import android.location.Address
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_display_data.*

class DisplayData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)
        val name = intent.getStringExtra(ContentMarshallConsts.NAME_CONTENT.text)
        val address = intent.getStringExtra(ContentMarshallConsts.ADDRESS_CONTENT.text)

        Log.d("--- NAME ---", name)
        Log.d("--- ADDRESS ---", address)

        val toast: Toast = Toast(this)

        makeToast(this, name)
        makeToast(this, address)

        textview_name.text = name
        textview_address.text = address

    }
}
