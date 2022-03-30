package com.hazCr.android_studio_lab_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class UserDetailsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        val view:View = inflater.inflate(R.layout.fragment_user_detaiks, container, false)
        val email:TextView = view.findViewById(R.id.userNameResult)
        val signOut : Button = view.findViewById(R.id.signOutBtn)

        // add ? for save
        email.text = arguments?.getString("userEmail").toString()

        signOut.setOnClickListener {
            val  intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)

        }
        // Inflate the layout for this fragment
        return view
    }


}