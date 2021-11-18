package com.childgame.sandbox1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ActivityTask6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)

        val taskView: ImageView = findViewById(R.id.task_view)

        val winButton: ImageButton = findViewById(R.id.button_3)


        winButton.setOnClickListener {

            taskView.setImageResource(R.drawable.plum)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask66 = Intent(this, ActivityTask7::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask66)

        }

        val prevButton: ImageButton = findViewById(R.id.start_button)

        val intentTask6 = Intent(this, ActivityTask5::class.java)

        prevButton.setOnClickListener {

            startActivity(intentTask6)

        }

        val falseButton1: ImageButton = findViewById(R.id.button_1)

        falseButton1.setOnClickListener {

            falseButton1.setImageResource(R.drawable.pear_black)

            taskView.setImageResource(R.drawable.plum_black)

        }

        val falseButton2: ImageButton = findViewById(R.id.button_4)

        falseButton2.setOnClickListener {

            falseButton2.setImageResource(R.drawable.banan_black)

            taskView.setImageResource(R.drawable.plum_black)

        }

        val falseButton3: ImageButton = findViewById(R.id.button_2)

        falseButton3.setOnClickListener {

            falseButton3.setImageResource(R.drawable.orange_black)

            taskView.setImageResource(R.drawable.plum_black)

        }

    }

}