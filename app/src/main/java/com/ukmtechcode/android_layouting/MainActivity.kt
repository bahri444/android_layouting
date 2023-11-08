package com.ukmtechcode.android_layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ukmtechcode.android_layouting.databinding.ActivityLoginBinding
import com.ukmtechcode.android_layouting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var go_to_tugas_layout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginPageButton.setOnClickListener{
            val intent = Intent(this, LoginActifity::class.java)
            startActivity(intent)
        }
    }
}