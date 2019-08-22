package com.example.logintest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bem_vindo.*
import kotlinx.android.synthetic.main.activity_main.*

class BemVindo : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        btnRomance.setOnClickListener {

            val nextIntent = Intent(this, Romance::class.java)
            startActivity(nextIntent)
        }
        btnDrama.setOnClickListener{
            val nextIntent = Intent(this, Drama::class.java)
            startActivity(nextIntent)

        }


    }

}
