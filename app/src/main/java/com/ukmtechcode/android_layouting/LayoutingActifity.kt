package com.ukmtechcode.android_layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LayoutingActifity : AppCompatActivity() {
    private lateinit var getPanjang :TextView
    private lateinit var getLebar :TextView
    private lateinit var getTextHitung:TextView
    private lateinit var getTombolHitung:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouting)

        //call funtion
        initComponent()
        getTombolHitung.setOnClickListener {
            val panjang = getPanjang.text.toString().toInt()
            val lebar = getLebar.text.toString().toInt()

            val hasil = panjang*lebar
            getTextHitung.text = hasil.toString()
        }
    }
    private fun initComponent(){
        getPanjang = findViewById(R.id.inputPanjang)
        getLebar = findViewById(R.id.inputLebar)
        getTextHitung = findViewById(R.id.text_count)
        getTombolHitung = findViewById(R.id.tombol_hitung)
    }
}