package com.junhyeon.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.junhyeon.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //findviewbyid를 이용한 방식
        val btn = findViewById<Button>(R.id.testBtn)
        btn.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }

        //데이터바인딩을 이용한 방식
        binding.testBtn.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }
    }
}