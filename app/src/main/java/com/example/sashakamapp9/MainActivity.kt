package com.example.sashakamapp9

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button
    lateinit var kissesText : TextView
    lateinit var btnTapMe:Button

    //val strKisses: String = getString(R.string.kisses)
    lateinit var strKisses: String
    //val str2: String = getString(R.string.new_text)
    lateinit var str2: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.random_button)
        kissesText = findViewById(R.id.random_text_view)
        strKisses = getString(R.string.kisses)
        str2 = getString(R.string.new_text)
        btnTapMe = findViewById(R.id.button)

        btn.setOnClickListener{

            kissesText.text=strKisses
        }
        btnTapMe.setOnClickListener{

            kissesText.text=str2
        }

        }






}

