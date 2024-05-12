package com.example.notes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homeapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeapp)
        val button = findViewById<Button>(R.id.buttonWriteNote)
        button.setOnClickListener {
            // Create an Intent to start TodoGetStart activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


