package com.example.myfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PassingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing)
        supportFragmentManager.beginTransaction().add(R.id.yellow_layout,BlueFragment()).commit()

    }
}