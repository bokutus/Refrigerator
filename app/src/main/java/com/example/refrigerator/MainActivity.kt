package com.example.refrigerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refrigerator1.setOnClickListener{ onOpenButtonTapped(it) }
        refrigerator2.setOnClickListener{ onOpenButtonTapped(it) }
        refrigerator3.setOnClickListener{ onOpenButtonTapped(it) }

    }
    fun onOpenButtonTapped(view: View?){
        val intent = Intent(this, openBox::class.java)
        startActivity(intent)
    }
}
