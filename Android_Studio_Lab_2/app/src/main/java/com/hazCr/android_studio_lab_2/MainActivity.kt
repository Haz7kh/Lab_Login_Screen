package com.hazCr.android_studio_lab_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/* TODO READ THE README FILE FIRST */

class MainActivity : AppCompatActivity() {
    lateinit var welcomeMsg:TextView
    lateinit var login :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeMsg=findViewById(R.id.welcome)
        login =findViewById(R.id.LoginBtn)

            login.setOnClickListener {
                val  intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)

            }
    }
}
