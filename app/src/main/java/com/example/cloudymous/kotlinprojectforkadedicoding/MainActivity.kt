package com.example.cloudymous.kotlinprojectforkadedicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textInput = "Belajar Kotlin"



        val textview = findViewById(R.id.textTV) as TextView
        val namaTV = findViewById(R.id.namaTV) as TextView
        val nipTV = findViewById(R.id.nipTV) as TextView

        val buttonChange = findViewById(R.id.prosesBT) as Button
        val buttonTampilnama = findViewById(R.id.tampilBT) as Button

        textview.setText(textInput)

        buttonChange.setOnClickListener {
            textInput = "Ganti Text"
            textview.setText(textInput)
        }

        val imran = Pengguna("Imran", 123)

        buttonTampilnama.setOnClickListener {
            namaTV.setText(imran.getNama())
            nipTV.setText(imran.getNomorInduk())
        }
    }
}
