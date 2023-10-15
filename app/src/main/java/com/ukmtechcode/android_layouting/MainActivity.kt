package com.ukmtechcode.android_layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var go_to_tugas_layout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        go_to_tugas_layout = findViewById(R.id.button_call_tugaslayout)
        go_to_tugas_layout.setOnClickListener{
            val intent = Intent(this, LayoutingActifity::class.java)
            startActivity(intent)
        }
    }
}