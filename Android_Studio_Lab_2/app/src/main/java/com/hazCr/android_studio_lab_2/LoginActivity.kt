package com.hazCr.android_studio_lab_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       val fragmentManager :FragmentManager = supportFragmentManager
       val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

       val loginFragment = LoginFragment()
       fragmentTransaction.add(R.id.frame,loginFragment)
       fragmentTransaction.commit()



    }
}