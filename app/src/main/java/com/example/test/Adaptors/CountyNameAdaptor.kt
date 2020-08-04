package com.example.test.Adaptors

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.test.R

class CountyNameAdaptor(private val context: Activity, private val country_name: Array<String>) :
    ArrayAdapter<String>(context, R.layout.custom_activity_dua, country_name) {
    private val city = arrayOf<String>(
        "Islamabad ,Pakistan",
        "New Delhi,India",
        "New York,USA",
        "London,UK",
        "Paris,France",
        "Rome,Italy",
        "Istanbul,Turkey",
        "Jakarta,Indonedsia",
        "AL Madina KSA",
        "Dubai,UAE",
        "Toronto,Canada",
        "Karbala,Iran",
        "Kuala Lampur,Malysia",
        "Al Masna, Syria",
        "Baghdad,Iraq",
        "Tokyo,Japan",
        "Kabul,Afghanistan",
        "Beijing,China",
        "Sydney,Australia",
        "Berlin,Germany"
    )
    override fun getView(position: Int, view: View?, paremt: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_ramzan_calender, null, true)
        val titleDuaName = rowView.findViewById(R.id.id_number) as TextView
        val titleDuaArabic = rowView.findViewById(R.id.country_name) as TextView
        val titleDuaEnglish = rowView.findViewById(R.id.discription) as TextView
        val counter = position + 1
        titleDuaName.text = counter.toString()
        titleDuaArabic.text = country_name[position]
        titleDuaEnglish.text =
            "Ramadan Celender of "+city[position]

        return rowView
    }
}