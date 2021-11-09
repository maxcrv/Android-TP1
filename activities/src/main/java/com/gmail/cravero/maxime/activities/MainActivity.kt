package com.gmail.cravero.maxime.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.gmail.cravero.maxime.tp1.ComputeActivity

private var nbClick = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.btn_click_me)
        clickTextView = findViewById(R.id.text_view)
        btnCompute = findViewById(R.id.btn_compute)

        clickButton.setOnClickListener {
//            Toast.makeText(baseContext, "Tu m'as cliqué", Toast.LENGTH_LONG).show()
            nbClick++
            val newText = "Vous avez cliqué $nbClick fois."
            clickTextView.text = newText
        }

        btnCompute.setOnClickListener {
            val intent = Intent(baseContext, ComputeActivity::class.java)
            startActivity(intent)
        }
    }
}

private lateinit var clickButton: Button
private lateinit var clickTextView: TextView
private lateinit var btnCompute: Button
