package com.example.cloudymous.kotlinprojectforkadedicoding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textInput = "Belajar Kotlin"

//        val textview = findViewById(R.id.textTV) as TextView
//        val namaTV = findViewById(R.id.namaTV) as TextView
//        val nipTV = findViewById(R.id.nipTV) as TextView

//        val buttonChange = findViewById(R.id.prosesBT) as Button
//        val buttonTampilnama = findViewById(R.id.tampilBT) as Button
//        val buttonNextIntent = findViewById(R.id.nextIntentBT) as Button

        textTV.setText(textInput)

        prosesBT.setOnClickListener {
            textInput = "Ganti Text"
            textTV.setText(textInput)
        }


        nextIntentBT.setOnClickListener {
            val nextRecycle = Intent(this, RecyclerViewActivity::class.java)
            startActivity(nextRecycle)
        }

//        buttonTampilnama.setOnClickListener {
//            namaTV.setText(imran.getNama())
//            nipTV.setText(imran.getNomorInduk())
//        }
    }
}
