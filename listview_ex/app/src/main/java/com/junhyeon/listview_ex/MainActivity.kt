 package com.junhyeon.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ListView
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
     private var isDouble = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("E","F"))

        val listview = findViewById<ListView>(R.id.mainListview)

        val listadapter = ListViewAdapter(list_item)
        listview.adapter = listadapter

    }

     override fun onBackPressed() {
         Log.d("MainActivity","BackButton")
         if(isDouble == true){
             finish()
         }
         isDouble = true

         Toast.makeText(this,"종료하실려면 더블클릭",Toast.LENGTH_LONG).show()

         Handler(mainLooper).postDelayed(Runnable {
                isDouble = false
         }, 2000)
     }

}