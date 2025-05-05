package com.example.tugasn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tugasn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShare = findViewById(R.id.btnShare)

        btnShare.setOnClickListener {
            val message = """
                💒 Undangan Pernikahan 💒
                
                Kami mengundang Anda untuk hadir dalam pernikahan kami:
                
                👫 Raisa & Hamish
                📅 Sabtu, 25 Mei 2025
                📍 Gedung Graha Wedding, Jakarta
                
                Merupakan suatu kehormatan dan kebahagiaan bagi kami apabila Anda berkenan hadir.
                
                Terima kasih. 💖
            """.trimIndent()

            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, message)
                type = "text/plain"
            }

            startActivity(Intent.createChooser(intent, "Bagikan undangan via"))
        }
    }
}