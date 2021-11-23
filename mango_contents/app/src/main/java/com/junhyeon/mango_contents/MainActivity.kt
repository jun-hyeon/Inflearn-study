package com.junhyeon.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/MiUxOS4Sd6",
                      "https://mp-seoul-image-production-s3.mangoplate.com/1053335_1594731546661094.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                       "테라로사커피공장")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/yMoUzcjge9Xh",
                "https://mp-seoul-image-production-s3.mangoplate.com/17447_1607297058483094.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "순두부젤라또")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/2gNHDMZOzG",
                "https://mp-seoul-image-production-s3.mangoplate.com/479730_1621603688356035.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "보헤미안")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/7fQJj6kP9r2W",
                "https://mp-seoul-image-production-s3.mangoplate.com/389868/424919_1619850053824_8227?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "비사이드그라운드")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/MiUxOS4Sd6",
                "https://mp-seoul-image-production-s3.mangoplate.com/1053335_1594731546661094.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "테라로사커피공장")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/yMoUzcjge9Xh",
                "https://mp-seoul-image-production-s3.mangoplate.com/17447_1607297058483094.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "순두부젤라또")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/2gNHDMZOzG",
                "https://mp-seoul-image-production-s3.mangoplate.com/479730_1621603688356035.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "보헤미안")
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/7fQJj6kP9r2W",
                "https://mp-seoul-image-production-s3.mangoplate.com/389868/424919_1619850053824_8227?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "비사이드그라운드")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

            val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                startActivity(intent)

            }
        }

        recyclerView.layoutManager = GridLayoutManager(this,2)
    }
}