package com.example.project1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var nameEditText: EditText
    lateinit var languageEditText: EditText
    lateinit var button: Button
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize widgets
        imageView = findViewById(R.id.imageView)
        nameEditText = findViewById(R.id.editText)
        languageEditText = findViewById(R.id.editText2)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        // handling user request
        button.setOnClickListener{
            // getting name from user
            var name = nameEditText.text.toString()
            // getting language
            var language =  languageEditText.text.toString()

            // say hello to the user
            Toast.makeText(this,"Hello $name", Toast.LENGTH_LONG).show()

                // Image setting
            if(language.equals("java")){
                imageView.setImageResource(R.drawable.javalogo)
            }
            else{
                imageView.setImageResource(R.drawable.kotlinlogo)
            }

        }

    }
}