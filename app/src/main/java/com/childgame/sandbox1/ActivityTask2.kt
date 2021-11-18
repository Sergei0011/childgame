package com.childgame.sandbox1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ActivityTask2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        val taskView: ImageView = findViewById(R.id.task_view)

        val winButton: ImageButton = findViewById(R.id.button_2)


        winButton.setOnClickListener {

            taskView.setImageResource(R.drawable.lemon)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask22 = Intent(this, ActivityTask3::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask22)

        }

        val prevButton: ImageButton = findViewById(R.id.start_button)

        val intentTask2 = Intent(this, ActivityTask1::class.java)

        prevButton.setOnClickListener {

            startActivity(intentTask2)

        }

        val falseButton1: ImageButton = findViewById(R.id.button_1)

        falseButton1.setOnClickListener {

            falseButton1.setImageResource(R.drawable.plum_black)

        }

        val falseButton2: ImageButton = findViewById(R.id.button_4)

        falseButton2.setOnClickListener {

            falseButton2.setImageResource(R.drawable.apple_black)

            taskView.setImageResource(R.drawable.lemon_black)

        }

        val falseButton3: ImageButton = findViewById(R.id.button_3)

        falseButton3.setOnClickListener {

            falseButton3.setImageResource(R.drawable.orange_black)

            taskView.setImageResource(R.drawable.lemon_black)

        }


    }

}