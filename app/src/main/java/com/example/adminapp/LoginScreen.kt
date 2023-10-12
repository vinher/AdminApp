package com.example.adminapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adminapp.databinding.LoginScreenBinding

class LoginScreen : AppCompatActivity() {
     private lateinit var _login:LoginScreenBinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _login = LoginScreenBinding.inflate(layoutInflater)
        setContentView(_login.root)
        _login.register.setOnClickListener {
            _login.mainScreen.visibility= View.GONE
            Toast.makeText(this,"Register",Toast.LENGTH_LONG).show()
            supportFragmentManager.beginTransaction().replace(R.id.screen_register,user_register())
                .commit()
        }
         _login.login.setOnClickListener {
             _login.mainScreen.visibility= View.GONE
             supportFragmentManager.beginTransaction().replace(R.id.home,Home()).commit()
         }
    }
}