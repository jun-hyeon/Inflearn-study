package com.junhyeon.nav_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var isClick = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun onBackPressed() {
        if(isClick){
            finish()
        }

        isClick = true
        Toast.makeText(this,"한 번 더 눌러 종요하세요",Toast.LENGTH_SHORT).show()
        Handler(mainLooper).postDelayed(Runnable {
            isClick = false
        },2000)
    }

}