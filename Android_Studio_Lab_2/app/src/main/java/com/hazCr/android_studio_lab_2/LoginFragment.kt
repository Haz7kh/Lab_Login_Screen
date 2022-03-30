package com.hazCr.android_studio_lab_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View =  inflater.inflate(R.layout.fragment_login, container, false)

        val email :EditText = view.findViewById(R.id.textEmail)
        val password:EditText=view.findViewById(R.id.textPassword)

        val signIn : Button = view.findViewById(R.id.buttonSignIn)



        signIn.setOnClickListener {


            val userEmail = email.text.toString()
            val userPassword =password.text.toString()
            val bundle = Bundle()
            if(userEmail.isNullOrBlank()&&userPassword.isNullOrBlank()) {
                Toast.makeText(activity,"Please fill the required fields ",Toast.LENGTH_LONG).show()
            }
            else if (userEmail=="haz@info.com"){
            bundle.putString("userEmail","welcome : khaled")
            val userDetailsFragment = UserDetailsFragment()
            userDetailsFragment.arguments = bundle
          // can not use support directly we need requireActivity
            val fragmentManager:FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction:FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame,userDetailsFragment)
            fragmentTransaction.commit()}

            else if (userEmail=="Sara@info.com"){
                bundle.putString("userEmail","welcome : Sara")
                val userDetailsFragment = UserDetailsFragment()
                userDetailsFragment.arguments = bundle
                // can not use support directly we need requireActivity
                val fragmentManager:FragmentManager = requireActivity().supportFragmentManager
                val fragmentTransaction:FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame,userDetailsFragment)
                fragmentTransaction.commit()}

            else{
                Toast.makeText(activity,"Wrong user name or password",Toast.LENGTH_LONG).show()
            }

        }


        // Inflate the layout for this fragment
        return view
    }


}