package com.example.assignment1_luisrodriguez_kerrywilcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Bgrade).setOnClickListener{
            val grade = findViewById<EditText>(R.id.ETgrade).text.toString()


        }

    }
}