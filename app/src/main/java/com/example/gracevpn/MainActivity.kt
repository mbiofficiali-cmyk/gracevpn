package com.example.gracevpn

import android.content.Intent
import android.net.VpnService
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity
import com.example.gracevpn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    private val prepLauncher = registerForActivityResult(StartActivityForResult()) {
        // بعد از گرفتن اجازه، سرویس را استارت می‌کنیم (نسخه دمو)
        startService(Intent(this, CoreVpnService::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnToggle.setOnClickListener {
            val intent = VpnService.prepare(this)
            if (intent != null) prepLauncher.launch(intent)
            else startService(Intent(this, CoreVpnService::class.java))
        }
    }
}
