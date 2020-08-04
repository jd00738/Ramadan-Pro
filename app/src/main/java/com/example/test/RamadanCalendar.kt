package com.example.test

//import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test.Adaptors.CountyNameAdaptor
import kotlinx.android.synthetic.main.activity_ramadan_calendar.*
import kotlinx.android.synthetic.main.toolbar.*

class RamadanCalendar : AppCompatActivity() {
    val CountryArray = arrayOf<String> ("Pakistan","India","USA","UK","France","Italy","Turkey","Indonedsia","KSA","UAE","Canada","Iran","Malysia","Syria","Iraq","Japan","Afghanistan","China","Australia","Germany")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramadan_calendar)
        action_bar_title.text="Calendar(select country)"
        action_bar_back.setOnClickListener(View.OnClickListener {
            finish()
        })

        val myListAdapter = CountyNameAdaptor(this,CountryArray)
        ramazan_calender_list.adapter=myListAdapter
        ramazan_calender_list.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            val intent = Intent(this,CountryTimingView::class.java)
            intent.putExtra("Country",""+itemAtPos+"")
            intent.putExtra("position",""+itemIdAtPos+"")
            startActivity(intent)
//            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }
}
