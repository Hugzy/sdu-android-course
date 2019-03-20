package com.android.lecture2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.android.lecture2.ContentMarshallConsts.NAME_CONTENT
import kotlinx.android.synthetic.main.activity_collect_name.*
import kotlinx.android.synthetic.main.content_collect_name.*

class CollectNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_name)
        setSupportActionBar(toolbar)
    }

    fun next(view: View){
        val intent = Intent(this, CollectAddress::class.java)
        val name = textfield_name.text.toString()
        intent.putExtra(NAME_CONTENT.text, name)
        startActivity(intent)
    }


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        val name = textfield_name.text.toString()
        outState?.putString(ContentMarshallConsts.NAME_CONTENT.text, name)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        val name = savedInstanceState?.getString(ContentMarshallConsts.NAME_CONTENT.text)
        textfield_name.setText(name)
    }

}
