package com.warehouseBundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btn: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn_login)
        btn?.setOnClickListener {
            val intent = Intent(this@MainActivity, SideBarActivity::class.java)
            startActivity(intent)
        }
        
    }
}