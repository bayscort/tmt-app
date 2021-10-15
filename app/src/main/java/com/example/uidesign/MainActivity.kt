package com.example.uidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // handle on click

        binding.layoutBackend.setOnClickListener{
            val intent = Intent(this@MainActivity, BackendActivity::class.java)
            startActivity(intent)
        }

        binding.layoutFrontend.setOnClickListener{
            val intent = Intent(this@MainActivity, FrontendActivity::class.java)
            startActivity(intent)
        }
        binding.layoutMobile.setOnClickListener{
            val intent = Intent(this@MainActivity, MobileActivity::class.java)
            startActivity(intent)
        }
        binding.layoutQA.setOnClickListener{
            val intent = Intent(this@MainActivity, QualityAcitivity::class.java)
            startActivity(intent)
        }
    }
}