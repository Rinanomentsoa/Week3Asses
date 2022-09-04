package com.tech4dev.wmtchat.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tech4dev.wmtchat.R

class BroadcastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
               Log.i("Broadcast", "action: action")
    }
}