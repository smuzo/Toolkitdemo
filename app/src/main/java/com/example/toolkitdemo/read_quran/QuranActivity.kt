package com.example.toolkitdemo.read_quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolkitdemo.R

class QuranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quran)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer,QuranBySurahFragment())
            .commit()
    }
}