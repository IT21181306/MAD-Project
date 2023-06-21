package com.example.myapplication2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.R

class NoticeActivity : AppCompatActivity() {

    private lateinit var button3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)

        button3 = findViewById(R.id.button3)

        button3.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val number1 = findViewById<EditText>(R.id.num11)
        val number2 = findViewById<EditText>(R.id.num22)
        val resultTextview = findViewById<TextView>(R.id.resultView)
        val calButton = findViewById<Button>(R.id.calbutton)

        calButton.setOnClickListener {
            val n1 = number1.text.toString().toInt()
            val n2 = number2.text.toString().toInt()
            var result = 0
            if (n1 < 35000 && n2 <= 4) {
                result = 750 * n2
                resultTextview.text = result.toString()
            } else {
                Toast.makeText(this, "Error: Invalid input .You are not selected ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
