package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.view.View

import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
private lateinit var nameInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameInput=findViewById(R.id.nameInput)
    }

    fun createBirthdayCard(view: View) {
        val name =nameInput.editableText.toString()
        val intent =Intent(
            this,
            BirthdayGreetingActivity::class.java
        )
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }


}