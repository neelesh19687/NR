package com.example.nr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

         val  actionBar = supportActionBar

        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}