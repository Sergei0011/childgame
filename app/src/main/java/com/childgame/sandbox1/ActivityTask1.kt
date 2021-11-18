package com.childgame.sandbox1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ActivityTask1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)

        val taskView: ImageView = findViewById(R.id.task_view)

        val winButton: ImageButton = findViewById(R.id.button_4)


        winButton.setOnClickListener {

            taskView.setImageResource(R.drawable.apple)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask1 = Intent(this, ActivityTask2::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask1)

        }

        val falseButton1: ImageButton = findViewById(R.id.button_1)

        falseButton1.setOnClickListener {

            falseButton1.setImageResource(R.drawable.pear_black)

            taskView.setImageResource(R.drawable.apple_black)

        }

        val falseButton2: ImageButton = findViewById(R.id.button_2)

        falseButton2.setOnClickListener {

            falseButton2.setImageResource(R.drawable.plum_black)

            taskView.setImageResource(R.drawable.apple_black)

        }

        val falseButton3: ImageButton = findViewById(R.id.button_3)

        falseButton3.setOnClickListener {

            falseButton3.setImageResource(R.drawable.orange_black)

            taskView.setImageResource(R.drawable.apple_black)

        }

    }

}