package com.example.sportzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_matches_main.*

class matches_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches_main)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        var rec = findViewById<LinearLayout>(R.id.recent)
        var sch = findViewById<LinearLayout>(R.id.schedule)

        rec.setOnClickListener{
            var int = Intent(this@matches_main, matches::class.java)
            startActivity(int)
        }

        sch.setOnClickListener{
            var int = Intent(this@matches_main, matches_schedules::class.java)
            startActivity(int)
        }
    }
}