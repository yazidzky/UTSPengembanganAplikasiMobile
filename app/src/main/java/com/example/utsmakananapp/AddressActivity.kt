package com.example.utsmakananapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.widget.Toolbar

class AddressActivity : AppCompatActivity() {

    private lateinit var namaLengkap: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        namaLengkap = intent.getStringExtra("namaLengkap") ?: "Pengguna"

        findViewById<Button>(R.id.btnOrderKirim).setOnClickListener {
            val nama   = findViewById<EditText>(R.id.etNamaLengkap).text.toString()
            val alamat = findViewById<EditText>(R.id.etAlamat).text.toString()
            val patok  = findViewById<EditText>(R.id.etPatokan).text.toString()

            if (nama.isBlank() || alamat.isBlank() || patok.isBlank()) {
                Toast.makeText(this, "Lengkapi semua field", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            startActivity(
                Intent(this, ConfirmationActivity::class.java)
                    .putExtra("namaLengkap", nama)
                    .putExtra("alamat", alamat)
                    .putExtra("patokan", patok)
            )
            Toast.makeText(this, getString(R.string.toast_pesanan_dikirim_progress), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}