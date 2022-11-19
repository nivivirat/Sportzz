package com.example.sportzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listitem.*

class latest_updates : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<updates>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var body : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latest_updates)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        supportActionBar?.hide()

        imageId = arrayOf(
            R.drawable.india_washout,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,

            )

        body = arrayOf(
            "Rain threat looms large as new-look India hope to seize opportunity",
            "So, all 10 franchises have revealed their retentions and releases. Now for the auction to plug some gaps and before you know it, IPL 2023 will be upon us!",
            "Cricket's changing landscape a challenge for us: Williamson",
            "England aim to extend their white-ball supremacy\nWith Aaron Finch announcing his ODI retirement, Travis Head has the chance to put his hand up to be David Warner's regular opening partner in the 50-over format, with an eye on next year's World Cup in India.",
            "Boult, Guptill dropped for India series",
            "Blow for Sydney Thunder as David Willey pulls out of BBL"
        )

        heading = arrayOf(
            "INDIA TOUR OF NEW ZEALAND, 2022",
            "IPL 2023",
            "NEW ZEALAND CRICKET",
            "ENGLAND TOUR OF AUSTRALIA, 2022",
            "INDIA TOUR OF NEW ZEALAND, 2022",
            "BBL 2022-23"
        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<updates>()
        getUserdata()

    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val update = updates(body[i],imageId[i],heading[i])
            newArrayList.add(update)
        }

        newRecyclerView.adapter = myadpater(newArrayList)

    }
}