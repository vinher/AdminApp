package com.example.adminapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adminapp.databinding.LoginScreenBinding

class LoginScreen : AppCompatActivity() {
     private lateinit var _login:LoginScreenBinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _login = LoginScreenBinding.inflate(layoutInflater)
        setContentView(_login.root)

    }
}