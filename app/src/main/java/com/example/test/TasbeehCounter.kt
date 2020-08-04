package com.example.test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tasbeeh_counter.*
import kotlinx.android.synthetic.main.toolbar.*

private var counter=0
class TasbeehCounter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh_counter)
        action_bar_title.text="Tasbeeh Counter"

        action_bar_back.setOnClickListener(View.OnClickListener {
            finish()
        })
        if (counter>0){
            tasbeeh_count_display.text= counter.toString()
        }
        tasbeeh_reset_button.setOnClickListener(View.OnClickListener {
            counter=0
            tasbeeh_count_display.text= "0000"
        })

        tasbeeh_counter.setOnClickListener(View.OnClickListener {
            counter= counter+1
            tasbeeh_count_display.text= counter.toString()
        })
    }
}
