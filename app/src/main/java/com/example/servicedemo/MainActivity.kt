package com.example.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var service = MyService()

        binding.btnStart.setOnClickListener {
            startService(Intent(this@MainActivity, MyService::class.java))
        }
        binding.btnEnd.setOnClickListener {
            stopService(Intent(this@MainActivity, MyService::class.java))
        }
    }
}