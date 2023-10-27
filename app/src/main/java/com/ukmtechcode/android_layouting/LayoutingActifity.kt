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
    private lateinit var getTinggi:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouting)

        //call funtion initComponent
        initComponent()
        getTombolHitung.setOnClickListener {
            val panjang = getPanjang.text.toString()
            val lebar = getLebar.text.toString()
            val tinggi = getTinggi.text.toString()

//            check apakah inputan nilai ada nilai yang di inputkan atau tidak
            if (lebar.isEmpty() || panjang.isEmpty() || tinggi.isEmpty()){
                getTextHitung.text="inputan tidak boleh kosong"
            }else{
                val hasil = panjang.toInt() * lebar.toInt() * tinggi.toInt()
                getTextHitung.text = hasil.toString()
            }
        }
    }
    private fun initComponent(){
        getPanjang = findViewById(R.id.inputPanjang)
        getLebar = findViewById(R.id.inputLebar)
        getTextHitung = findViewById(R.id.text_count)
        getTombolHitung = findViewById(R.id.tombol_hitung)
        getTinggi = findViewById(R.id.inputTinggi)
    }
}