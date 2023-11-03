package com.ukmtechcode.android_layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ukmtechcode.android_layouting.databinding.ActivityLayoutingBinding

class LayoutingActifity : AppCompatActivity() {
//    deklarasi view binding
    private lateinit var binding: ActivityLayoutingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLayoutingBinding.inflate(layoutInflater)
        setContentView(binding.root)  //dapat menggantikan pemanggilan view xml
        binding.tombolHitung.setOnClickListener {
            val panjang = binding.inputPanjang.text.toString()
            val lebar = binding.inputLebar.text.toString()
            val tinggi = binding.inputTinggi.text.toString()

//            check apakah inputan nilai ada nilai yang di inputkan atau tidak
            if (lebar.isEmpty() || panjang.isEmpty() || tinggi.isEmpty()){
                binding.textCount.text="inputan tidak boleh kosong"
            }else{
                val hasil = panjang.toInt() * lebar.toInt() * tinggi.toInt()
                binding.textCount.text = hasil.toString()
            }
        }
    }
}