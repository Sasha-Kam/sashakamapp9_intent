package com.example.sashakamapp9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)
        nextActivityButton.setOnClickListener {
            val secondActivityIntent:Intent= Intent(this, SecondActivity::class.java) /* создали переменную,
            которая хранит в себе переход на след. Активность. this - это про контекст. "Хочешь получить контекст, см. на Акттивость" */

            startActivity(secondActivityIntent) // Запуск Intent с пом ф. StartActivity и кладем в нее этот I.
        }

        }






}

