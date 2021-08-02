package com.indian.poker.hyoblibrary

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import common.library.core.HyobCore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.hello)
        textView.text = HyobCore.core()

    }
}
