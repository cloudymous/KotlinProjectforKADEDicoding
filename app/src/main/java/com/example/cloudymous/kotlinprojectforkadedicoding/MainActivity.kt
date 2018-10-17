package com.example.cloudymous.kotlinprojectforkadedicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInput = "Belajar Kotlin"

        val textview = findViewById(R.id.textTV) as TextView

        textview.setText(textInput)
    }
}
