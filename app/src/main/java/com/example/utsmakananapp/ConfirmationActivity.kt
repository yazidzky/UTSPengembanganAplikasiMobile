package com.example.utsmakananapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {

    private lateinit var namaLengkap: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        namaLengkap = intent.getStringExtra("namaLengkap") ?: "Pengguna"

        findViewById<TextView>(R.id.tvHalo).text =
            getString(R.string.halo_user, namaLengkap)

        findViewById<Button>(R.id.btnKirim).setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_pesanan_selesai), Toast.LENGTH_SHORT).show()
            finishAffinity() // tutup semua activity & kembali ke launcher
        }
    }
}