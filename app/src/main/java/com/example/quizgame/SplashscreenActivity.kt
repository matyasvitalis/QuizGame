package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class SplashscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        val mainIntent = Intent(this@SplashscreenActivity, MainActivity::class.java)
        var easyDifficulty = false
        var normalDifficulty = false
        var hardDifficulty = false
        val startButton: Button = findViewById(R.id.StartButton)
        val easyDifficultyButton: RadioButton = findViewById(R.id.Difficultyradiobutton1)
        val normalDifficultyButton: RadioButton = findViewById(R.id.Difficultyradiobutton2)
        val hardDifficultyButton: RadioButton = findViewById(R.id.Difficultyradiobutton3)

        startButton.setOnClickListener {
            if (easyDifficultyButton.isChecked)
            {
                easyDifficulty = true
            }
            else if (normalDifficultyButton.isChecked)
            {
                normalDifficulty = true
            }
            else if (hardDifficultyButton.isChecked)
            {
                hardDifficulty = true
            }
            // If the user didn't checked anything
            else
            {
                easyDifficulty = true
            }
            // If the user didn't checked anything
            mainIntent.putExtra("EasyDifficulty", easyDifficulty)
            mainIntent.putExtra("NormalDifficulty", normalDifficulty)
            mainIntent.putExtra("HardDifficulty", hardDifficulty)
            startActivity(mainIntent)
        }
    }
}