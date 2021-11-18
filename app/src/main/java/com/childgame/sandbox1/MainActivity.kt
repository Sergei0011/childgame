package com.childgame.sandbox1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: ImageButton = findViewById(R.id.main_button)

        val intent = Intent(this, ActivityTask1::class.java)

        startButton.setOnClickListener() {
            startActivity(intent)
        }

    }

}