package com.ukmtechcode.android_layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ukmtechcode.android_layouting.databinding.ActivityLoginBinding

class LoginActifity : AppCompatActivity() {
//    deklarasi view binding
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            if (username.isEmpty() || password.isEmpty()){
                binding.alertTextView.text="inputan tidak boleh kosong"
            }else if(username.isNotEmpty() || password.isNotEmpty()){
                if ((username=="bahri" && password=="bahriemet098")){
                    binding.LoginButton.setOnClickListener {
                        val intent = Intent(this, LayoutingActifity::class.java)
                        startActivity(intent)
                    }
                }else if (username!="bahri" && password!="bahriemet098"){
                    binding.alertTextView.text="username atau password salah"
                }
            }
        }
    }
}