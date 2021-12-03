package com.example.nr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_application.*
import kotlinx.android.synthetic.main.activity_main.*
class Application : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)

        val actionBar = supportActionBar

        actionBar!!.title = "Application"

        actionBar.setDisplayHomeAsUpEnabled(true)

        agebtn.setOnClickListener{
            val intent = Intent(this , ageapp::class.java)
            startActivity(intent)
        }

        abt.setOnClickListener{
            val intent = Intent(this , about::class.java)
            startActivity(intent)
        }
    }
}