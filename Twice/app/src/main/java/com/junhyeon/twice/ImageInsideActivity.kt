package com.junhyeon.twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        val ImageView = findViewById<ImageView>(R.id.imageView)

        Toast.makeText(this,getData,Toast.LENGTH_LONG).show()

        if(getData == "1"){
            ImageView.setImageResource(R.drawable.member_1)
        }

        if(getData == "2"){
            ImageView.setImageResource(R.drawable.member_2)
        }

        if(getData == "3"){
            ImageView.setImageResource(R.drawable.member_3)
        }

        if(getData == "3"){
            ImageView.setImageResource(R.drawable.member_3)
        }

        if(getData == "4"){
            ImageView.setImageResource(R.drawable.member_4)
        }

        if(getData == "5"){
            ImageView.setImageResource(R.drawable.member_5)
        }

        if(getData == "6"){
            ImageView.setImageResource(R.drawable.member_6)
        }

        if(getData == "7"){
            ImageView.setImageResource(R.drawable.member_7)
        }

        if(getData == "8"){
            ImageView.setImageResource(R.drawable.member_8)
        }

        if(getData == "9"){
            ImageView.setImageResource(R.drawable.member_9)
        }

    }
}