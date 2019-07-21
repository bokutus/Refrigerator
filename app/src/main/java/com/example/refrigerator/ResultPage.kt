package com.example.refrigerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_page.*
import kotlin.random.Random


class ResultPage : AppCompatActivity() {

    val a = 0
    val b = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)

        retryButton.setOnClickListener {
            val intent = Intent( this, MainActivity ::class.java)
            startActivity(intent)

            //ねねっちの運命を決める
            val z = Random.nextInt(2)
            when(z) {
                a -> resultImage.setImageResource(R.drawable.arrestted_nene)
                b -> resultImage.setImageResource(R.drawable.good_taste)
                a -> resultText.setImageResource(R.drawable.sorry)
                b -> resultText.setImageResource(R.drawable.yammy)
            }
        }
    }

}
