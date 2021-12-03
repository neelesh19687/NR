package com.example.nr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ageapp.*
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
class ageapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ageapp)

        val actionBar = supportActionBar

        actionBar!!.title = "AgeApp"

        actionBar.setDisplayHomeAsUpEnabled(true)



    }
    fun ageSubmit (view: View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        result.text = "Your Age : " + (currentYear - input.text.toString().toInt())
    }
}