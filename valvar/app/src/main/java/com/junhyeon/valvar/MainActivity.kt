package com.junhyeon.valvar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = "여기는 value입니다."
        val value2 = "여기는 value2입니다."

        value = "여기는 value가 아닙니다."

        Log.e("MainActivity","testLog")

    }
}