package com.example.quizgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        val intent = intent
        val points = intent.getIntExtra("points", 0)
        val pointText: TextView = findViewById(R.id.numbersofpoints)

        pointText.text = "Pontszámod: $points"

    }
}