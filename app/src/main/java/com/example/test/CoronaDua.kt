package com.example.test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*

class CoronaDua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corona_dua)
        action_bar_title.text = "Cornona Defense Dua"
        action_bar_back.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
