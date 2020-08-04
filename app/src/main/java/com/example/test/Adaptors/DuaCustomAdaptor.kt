package com.example.test.Adaptors

//import android.support.v4.content.ContextCompat.getSystemService
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.test.R

class DuaCustomAdaptor(
    private val context: Activity,
    private val dua_name: Array<String>,
    private val dua_arabic: Array<String>,
    private val dua_english: Array<String>,
    private val dua_urdu: Array<String>
) :
    ArrayAdapter<String>(context, R.layout.custom_activity_dua, dua_name) {

    override fun getView(position: Int, view: View?, paremt: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_activity_dua, null, true)
        val titleDuaName = rowView.findViewById(R.id.dua_name) as TextView
        val titleDuaArabic = rowView.findViewById(R.id.dua_arabic) as TextView
        val titleDuaEnglish = rowView.findViewById(R.id.dua_english) as TextView
        val titleDuaUrdu = rowView.findViewById(R.id.dua_urdu) as TextView

        titleDuaName.text = dua_name[position]
        titleDuaArabic.text = dua_arabic[position]
        titleDuaEnglish.text = dua_english[position]
        titleDuaUrdu.text = dua_urdu[position]

        return rowView
    }
}