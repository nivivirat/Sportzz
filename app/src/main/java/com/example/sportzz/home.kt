package com.example.sportzz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import com.example.sportzz.databinding.ActivityHomeBinding
import com.example.sportzz.databinding.ActivityMainBinding

class home : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        var log_in_unknown = findViewById<TextView>(R.id.id_login_unknown)

        log_in_unknown.setOnClickListener {
            var int = Intent(this@home,home2::class.java)
            startActivity(int)
        }

    }
}