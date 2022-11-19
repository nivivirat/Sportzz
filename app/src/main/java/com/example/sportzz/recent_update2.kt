package com.example.sportzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class recent_update2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_update2)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

    }
}