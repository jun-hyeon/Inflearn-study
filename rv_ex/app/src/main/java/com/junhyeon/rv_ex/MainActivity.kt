package com.junhyeon.rv_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = mutableListOf<String>()

        items.add("a")
        items.add("b")
        items.add("c")

        val rv = findViewById<RecyclerView>(R.id.rv)

        val rvadapter = RVAdapter(items)

        rv.adapter = rvadapter
        rv.layoutManager = LinearLayoutManager(this)

        Log.e("MAINACTIVITY",""+items.size)

        rvadapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                Toast.makeText(baseContext,items[position],Toast.LENGTH_LONG).show()
            }
        }

    }
}