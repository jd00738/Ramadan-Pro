package com.example.test.Adaptors

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.test.R

class CountryTimeAdaptor(
    private val context: Activity,
    private val ramadan_day: Array<String>,
    private val ramadan_date: Array<String>,
    private val week_day: Array<String>,
    private val sehar_time: Array<String>,
    private val aftar_time: Array<String>
) :
    ArrayAdapter<String>(context, R.layout.custom_country_view, ramadan_day) {
    override fun getView(position: Int, view: View?, paremt: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_country_view, null, true)
        val titleRamadanDay = rowView.findViewById(R.id.rozaNumber) as TextView
        val titleRamadanDate = rowView.findViewById(R.id.rozaDate) as TextView
        val titleSeharTime = rowView.findViewById(R.id.seharTime) as TextView
        val titleAftarTime = rowView.findViewById(R.id.aftarTime) as TextView

        titleRamadanDay.text = ramadan_day[position] + " Ramadan"
        titleRamadanDate.text = week_day[position] + ", " + ramadan_date[position]
        titleAftarTime.text = aftar_time[position]
        titleSeharTime.text = sehar_time[position]

        return rowView
    }
}
