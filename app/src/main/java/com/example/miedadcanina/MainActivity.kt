package com.example.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.button)

        Log.v("MainActivity", "Activity verbose")
        Log.d("MainActivity", "Activity debug")
        Log.i("MainActivity", "Activity info")
        Log.w("MainActivity", "Activity warning")
        Log.e("MainActivity", "Activity error")

        button.setOnClickListener {
            val ageString : String = ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt : Int = ageString.toInt()
                val result : Int = ageInt * 7
                resultText.text = getString(R.string.result_text, result)
            } else {
                Log.d("MainActivity", "Age string is empty")
                Toast.makeText(this, R.string.you_must_insert_your_age, Toast.LENGTH_SHORT).show()
            }

        }
    }
}