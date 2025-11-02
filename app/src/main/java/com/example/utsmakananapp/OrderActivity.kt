package com.example.utsmakananapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class OrderActivity : AppCompatActivity() {

    private lateinit var namaLengkap: String
    private lateinit var makanan: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        namaLengkap = intent.getStringExtra("namaLengkap") ?: "Nazwa"
        makanan     = intent.getStringExtra("makanan") ?: "Tidak ada"

        findViewById<TextView>(R.id.tvHalo).text =
            getString(R.string.halo_user, namaLengkap)

        findViewById<TextView>(R.id.tvPesanan).text = getString(R.string.pesanan_saya)

        findViewById<TextView>(R.id.tvDaftarPesanan).text = " $makanan"

        findViewById<Button>(R.id.btnKirim).setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_pesanan_dikirim), Toast.LENGTH_SHORT).show()
            startActivity(
                Intent(this, AddressActivity::class.java)
                    .putExtra("namaLengkap", namaLengkap)
            )
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.nav_order
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_order -> true
                R.id.nav_profile -> true
                else -> false
            }
        }
    }
}
