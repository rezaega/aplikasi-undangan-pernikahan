package com.example.tugasn

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvDetail = findViewById<TextView>(R.id.tvDetail)

        val nama = intent.getStringExtra("nama")
        val tanggal = intent.getStringExtra("tanggal")
        val lokasi = intent.getStringExtra("lokasi")

        tvDetail.text = """
            Nama: $nama
            Tanggal: $tanggal
            Lokasi: $lokasi
        """.trimIndent()
    }
}
