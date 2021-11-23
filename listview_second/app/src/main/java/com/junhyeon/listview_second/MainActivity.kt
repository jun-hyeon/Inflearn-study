package com.junhyeon.listview_second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
//
//        list_item.add("a")
//        list_item.add("b")
//        list_item.add("c")

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("e","f"))

        val listview = findViewById<ListView>(R.id.listView)

        val listViewAdapter = ListViewAdapter(list_item)
        listview.adapter = listViewAdapter

        listview.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,list_item[position].text1 + " " + list_item[position].text2,Toast.LENGTH_LONG).show()
        }
    }
}