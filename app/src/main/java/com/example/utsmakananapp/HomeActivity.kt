package com.example.utsmakananapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<TextView>(R.id.tvHalo).text = "Halo Nazwa,"

        findViewById<LinearLayout>(R.id.itemCombro).setOnClickListener {
            keOrder("Combro")
        }
        findViewById<LinearLayout>(R.id.itemBatagor).setOnClickListener {
            keOrder("Batagor")
        }
        findViewById<LinearLayout>(R.id.itemSeblak).setOnClickListener {
            keOrder("Seblak")
        }
        findViewById<LinearLayout>(R.id.itemSurabi).setOnClickListener {
            keOrder("Surabi")
        }
        findViewById<LinearLayout>(R.id.itemCilok).setOnClickListener {
            keOrder("Cilok")
        }
        findViewById<LinearLayout>(R.id.itemCimol).setOnClickListener {
            keOrder("Cimol")
        }
        findViewById<LinearLayout>(R.id.itemCireng).setOnClickListener {
            keOrder("Cireng")
        }
        findViewById<LinearLayout>(R.id.itemCuanki).setOnClickListener {
            keOrder("Cuanki")
        }
        findViewById<LinearLayout>(R.id.itemLotek).setOnClickListener {
            keOrder("Lotek")
        }
        findViewById<LinearLayout>(R.id.itemPeuyeum).setOnClickListener {
            keOrder("Peuyeum")
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.nav_home
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> true
                R.id.nav_order -> {
                    startActivity(Intent(this, OrderActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_profile -> true
                else -> false
            }
        }
    }

    private fun keOrder(namaMakanan: String) {
        Intent(this, OrderActivity::class.java).apply {
            putExtra("makanan", namaMakanan)
            startActivity(this)
        }
    }
}