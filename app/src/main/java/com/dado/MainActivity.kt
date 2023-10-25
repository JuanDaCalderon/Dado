package com.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById<Button>(R.id.roll_button)
        val resultText: TextView = findViewById<TextView>(R.id.result_text)
        rollButton.setOnClickListener {
            val randomInt = (1..7).random()
            resultText.text = randomInt.toString()
        }
    }
}