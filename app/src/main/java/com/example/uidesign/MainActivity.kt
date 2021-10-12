package com.example.uidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backendCard = findViewById<LinearLayout>(R.id.layoutBackend)
        val frontendCard = findViewById<LinearLayout>(R.id.layoutFrontend)
        val mobileAppCard = findViewById<LinearLayout>(R.id.layoutMobile)
        val qaCard = findViewById<LinearLayout>(R.id.layoutQA)


        // handle on click

        backendCard.setOnClickListener{
            val intent = Intent(this@MainActivity, BackendActivity::class.java)
            startActivity(intent)
        }

        frontendCard.setOnClickListener{
            val intent = Intent(this@MainActivity, FrontendActivity::class.java)
            startActivity(intent)
        }
        mobileAppCard.setOnClickListener{
            val intent = Intent(this@MainActivity, MobileActivity::class.java)
            startActivity(intent)
        }
        qaCard.setOnClickListener{
            val intent = Intent(this@MainActivity, QualityAcitivity::class.java)
            startActivity(intent)
        }
    }
}