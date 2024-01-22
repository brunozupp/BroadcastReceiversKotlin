package com.novelitech.broadcastreceiverskotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {

    /**
     * When a broadcast is sent by the system, then this broadcast is always sent with an intent .
     * So when the device enters the Airplane Mode, the system sends Intents to all apps that needs
     * to be notified about the change.
     */
    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        if(isAirplaneModeEnabled) {
            Toast.makeText(context, "Airplane mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane mode Disabled", Toast.LENGTH_LONG).show()
        }
    }
}