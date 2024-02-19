package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.os.Handler
import android.os.Looper

class SplashScreenExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_example)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this, SplashScreenExample::class.java)
                startActivity(i)
                finish()
            }, 5000
        )

    }
}