package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        val backtoSplashscreenActivity = Intent(this@LoseActivity,SplashscreenActivity::class.java)
        Handler().postDelayed({
            startActivity(backtoSplashscreenActivity)
            finish()}, 1000)

    }
}