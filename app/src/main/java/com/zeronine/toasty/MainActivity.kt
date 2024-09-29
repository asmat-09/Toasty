package com.zeronine.toasty

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zeronine.toastykit.ToastyKit

class MainActivity : AppCompatActivity() {

    private lateinit var tvToastMsg: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvToastMsg = findViewById(R.id.tvToastMsg)

        tvToastMsg.setOnClickListener {
            ToastyKit.customizable(this, "Hello-This is toast", Color.RED, com.zeronine.toastykit.R.drawable.ic_check, Color.RED, Color.YELLOW)
        }
    }
}