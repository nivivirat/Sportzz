package com.example.sportzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        var obj = "try again later !\nCurrently not in operation"
        Toast.makeText(applicationContext,obj.toString(), Toast.LENGTH_LONG).show()
    }
}