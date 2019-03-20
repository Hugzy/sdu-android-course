package com.android.lecture2

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.View
import android.widget.Toast
import com.android.lecture2.ContentMarshallConsts.*

import kotlinx.android.synthetic.main.activity_collect_address.*
import kotlinx.android.synthetic.main.content_collect_address.*
import kotlinx.android.synthetic.main.content_collect_name.*

class CollectAddress : AppCompatActivity() {

    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_address)
        setSupportActionBar(toolbar)
        name = intent.getStringExtra(NAME_CONTENT.text)
        makeToast(this, name)
    }

    fun next(view: View) {
        val intent = Intent(this, DisplayData::class.java)
        val address = textfield_address.text.toString()
        intent.putExtra(NAME_CONTENT.text, name)
        intent.putExtra(ADDRESS_CONTENT.text, address)
        startActivity(intent)
    }
}
