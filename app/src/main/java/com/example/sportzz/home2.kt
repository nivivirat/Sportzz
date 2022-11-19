package com.example.sportzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.WindowManager
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import org.w3c.dom.Text

class home2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        var btn_img_recent_1 = findViewById<ImageView>(R.id.img_article1)
        var btn_img_recent_2 = findViewById<ImageView>(R.id.img_article2)

        var text_recent_1 = findViewById<TextView>(R.id.btn_for_article)
        var text_recent_2 = findViewById<TextView>(R.id.btn_for_article2)


        btn_img_recent_1.setOnClickListener{
            var int = Intent(this@home2, recent_update1::class.java)
            startActivity(int)
        }

        btn_img_recent_2.setOnClickListener{
            var int = Intent(this@home2, recent_update2::class.java)
            startActivity(int)
        }

        text_recent_1.setOnClickListener{
            var int = Intent(this@home2, recent_update1::class.java)
            startActivity(int)
        }

        text_recent_2.setOnClickListener{
            var int = Intent(this@home2, recent_update2::class.java)
            startActivity(int)
        }

        var btn_matches = findViewById<TextView>(R.id.btn_for_matches)
        var btn_more = findViewById<TextView>(R.id.btn_for_more)

        btn_matches.setOnClickListener{
            var int = Intent(this@home2, matches_main::class.java)
            startActivity(int)
        }

        btn_more.setOnClickListener{
            var int = Intent(this@home2, more::class.java)
            startActivity(int)
        }

        var hor = findViewById<RelativeLayout>(R.id.horizontalscroll)

        hor.setOnClickListener{
            var int = Intent(this@home2, matches::class.java)
            startActivity(int)
        }


        var text_recent_1_ONE = findViewById<TextView>(R.id.btn_for_articleONE)
        var text_recent_2_ONE = findViewById<ImageView>(R.id.img_articleONE)


        text_recent_1_ONE.setOnClickListener{
            var int = Intent(this@home2, india_tour::class.java)
            startActivity(int)
        }

        text_recent_2_ONE.setOnClickListener{
            var int = Intent(this@home2, india_tour::class.java)
            startActivity(int)
        }


    }
}