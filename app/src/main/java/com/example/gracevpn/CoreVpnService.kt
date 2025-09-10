package com.example.gracevpn

import android.net.VpnService
import android.os.ParcelFileDescriptor

class CoreVpnService : VpnService() {
    private var tun: ParcelFileDescriptor? = null

    override fun onCreate() {
        super.onCreate()
        // دمو: یک TUN ساده (اتصال واقعی مرحله بعد)
        val builder = Builder()
            .setSession("GraceVPN")
            .addAddress("10.0.0.2", 24)
            .addRoute("0.0.0.0", 0)

        tun = builder.establish()
    }

    override fun onDestroy() {
        tun?.close()
        tun = null
        super.onDestroy()
    }
}
