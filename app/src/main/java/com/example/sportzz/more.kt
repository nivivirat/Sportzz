package com.example.sportzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_more.*

class more : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        var btn_settings = findViewById<LinearLayout>(R.id.btn_for_settings)

        btn_settings.setOnClickListener{
            var int = Intent(this@more, settings::class.java)
            startActivity(int)
        }

        var btn_latest_update = findViewById<LinearLayout>(R.id.btn_for_latest_update)

        btn_latest_update.setOnClickListener{
            var int = Intent(this@more, latest_updates::class.java)
            startActivity(int)
        }

        btn_for_login.setOnClickListener{
            var int = Intent(this@more, login::class.java)
            startActivity(int)
        }




    }
}