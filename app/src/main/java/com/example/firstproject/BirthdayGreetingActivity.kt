package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    private lateinit var birthdayGreeting:TextView
    companion object{
        const val NAME_EXTRA= "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        birthdayGreeting=findViewById(R.id.birthdayGreeting)
           val name= intent.getStringExtra(NAME_EXTRA)
          birthdayGreeting.text="Happy Birthday $name"

    }
}