package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.radiogroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radio1.setOnClickListener {
            binding.tvContainer.text = "Radio1"
        }

        binding.radio2.setOnClickListener {
            binding.tvContainer.text = "Radio2"
        }

        binding.radio3.setOnClickListener {
            binding.tvContainer.text = "Radio3"
        }


    }
}