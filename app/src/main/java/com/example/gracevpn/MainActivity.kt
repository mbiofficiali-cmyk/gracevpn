package com.example.gracevpn

import android.content.Intent
import android.net.VpnService
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 48, 48, 48)
        }
        val tv = TextView(this).apply { text = "GraceVPN (Demo)" }
        val btn = Button(this).apply { text = "Connect (request permission)" }

        btn.setOnClickListener {
            val prepare = VpnService.prepare(this)
            if (prepare != null) startActivity(prepare)
            else startService(Intent(this, CoreVpnService::class.java))
        }

        root.addView(tv)
        root.addView(btn)
        setContentView(root)
    }
}
