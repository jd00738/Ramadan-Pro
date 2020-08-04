package com.example.test

import AfghanistanTimes
import AustraliaTimes
import CanadaTimes
import ChinaTime
import FranceTimes
import GermanyTimes
import IndiaTimes
import IndonesiaTimes
import IranTimes
import IraqTimes
import ItalyTimes
import JapanTimes
import KSATimes
import MalysiaTimes
import PakTimes
import SyriaTimes
import TurkeyTimes
import UAETimes
import UKTimes
import USATimes
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.Adaptors.CountryTimeAdaptor
import kotlinx.android.synthetic.main.activity_country_timing_view.*
import kotlinx.android.synthetic.main.toolbar.*

class CountryTimingView : AppCompatActivity() {
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
    private var afg = AfghanistanTimes()
    private var aus = AustraliaTimes()
    private var france = FranceTimes()
    private var ger = GermanyTimes()
    private var india = IndiaTimes()
    private var china = ChinaTime()
    private var ind = IndonesiaTimes()
    private var iran = IranTimes()
    private var iraq = IraqTimes()
    private var italy = ItalyTimes()
    private var japan = JapanTimes()
    private var canada = CanadaTimes()
    private var ksa = KSATimes()
    private var mal = MalysiaTimes()
    private var pak = PakTimes()
    private var syria = SyriaTimes()
    private var turkey = TurkeyTimes()
    private var uae = UAETimes()
    private var uk = UKTimes()
    private var usa = USATimes()

    @Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_timing_view)
        val countryName = intent.getStringExtra("Country")
        val profileName = intent.getStringExtra("position")

        action_bar_title.text = city[profileName.toInt()]
        action_bar_back.setOnClickListener {
            finish()
        }
        when (countryName) {
            "Pakistan" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    pak.RamadanDay,
                    pak.RamadanDate,
                    pak.WeekDay,
                    pak.SehrTime,
                    pak.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "India" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    india.RamadanDay,
                    india.RamadanDate,
                    india.WeekDay,
                    india.SehrTime,
                    india.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "USA" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    usa.RamadanDay,
                    usa.RamadanDate,
                    usa.WeekDay,
                    usa.SehrTime,
                    usa.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "UK" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    uk.RamadanDay,
                    uk.RamadanDate,
                    uk.WeekDay,
                    uk.SehrTime,
                    uk.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }

            "Iran" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    iran.RamadanDay,
                    iran.RamadanDate,
                    iran.WeekDay,
                    iran.SehrTime,
                    iran.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "France" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    france.RamadanDay,
                    france.RamadanDate,
                    france.WeekDay,
                    france.SehrTime,
                    france.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Italy" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    italy.RamadanDay,
                    italy.RamadanDate,
                    italy.WeekDay,
                    italy.SehrTime,
                    italy.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Turkey" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    turkey.RamadanDay,
                    turkey.RamadanDate,
                    turkey.WeekDay,
                    turkey.SehrTime,
                    turkey.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Indonedsia" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    ind.RamadanDay,
                    ind.RamadanDate,
                    ind.WeekDay,
                    ind.SehrTime,
                    ind.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "KSA" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    ksa.RamadanDay,
                    ksa.RamadanDate,
                    ksa.WeekDay,
                    ksa.SehrTime,
                    ksa.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "UAE" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    uae.RamadanDay,
                    uae.RamadanDate,
                    uae.WeekDay,
                    uae.SehrTime,
                    uae.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Canada" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    canada.RamadanDay,
                    canada.RamadanDate,
                    canada.WeekDay,
                    canada.SehrTime,
                    canada.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Malysia" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    mal.RamadanDay,
                    mal.RamadanDate,
                    mal.WeekDay,
                    mal.SehrTime,
                    mal.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Syria" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    syria.RamadanDay,
                    syria.RamadanDate,
                    syria.WeekDay,
                    syria.SehrTime,
                    syria.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Iraq" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    iraq.RamadanDay,
                    iraq.RamadanDate,
                    iraq.WeekDay,
                    iraq.SehrTime,
                    iraq.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Japan" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    japan.RamadanDay,
                    japan.RamadanDate,
                    japan.WeekDay,
                    japan.SehrTime,
                    japan.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Afghanistan" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    afg.RamadanDay,
                    afg.RamadanDate,
                    afg.WeekDay,
                    afg.SehrTime,
                    afg.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "China" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    china.RamadanDay,
                    china.RamadanDate,
                    china.WeekDay,
                    china.SehrTime,
                    china.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Australia" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    aus.RamadanDay,
                    aus.RamadanDate,
                    aus.WeekDay,
                    aus.SehrTime,
                    aus.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            "Germany" -> {
                val myListAdapter = CountryTimeAdaptor(
                    this,
                    ger.RamadanDay,
                    ger.RamadanDate,
                    ger.WeekDay,
                    ger.SehrTime,
                    ger.aftarTime
                )
                county_calender_list_view.adapter = myListAdapter
            }
            else -> "Nothing Found"
        }


    }
}
