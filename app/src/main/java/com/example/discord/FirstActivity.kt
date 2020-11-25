package com.example.discord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        button.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

    }

}