package com.example.sample

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val lt = findViewById<LinearLayout?>(R.id.fullscreen_view)

        if (lt?.isVisible == true) {
            lt.isVisible = false
            return
        }

        super.onBackPressed()
    }
}