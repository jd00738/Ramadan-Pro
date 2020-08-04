package com.example.test

//import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_homs_test.*

class Home : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homs_test)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        MobileAds.initialize(this) {}
//
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        //For Qibla Direction
        qibla_direction_btn.setOnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()

            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }

            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdLoaded() {
                    // Code to be executed when an ad finishes loading.
                }

                override fun onAdFailedToLoad(errorCode: Int) {
                    // Code to be executed when an ad request fails.
                }

                override fun onAdOpened() {
                    // Code to be executed when the ad is displayed.
                }

                override fun onAdClicked() {
                    // Code to be executed when the user clicks on an ad.
                }

                override fun onAdLeftApplication() {
                    // Code to be executed when the user has left the app.
                }

                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    startActivity(Intent(this@Home, QiblaDirection::class.java))
                }
            }
        }

        //FOR RAMADAM CALENDAR
        ramadan_calender_btn.setOnClickListener {
            startActivity(Intent(this, RamadanCalendar::class.java))
        }

        //FOR CORONA DUA
        corona_dua_btn.setOnClickListener {
//            Toast.makeText(this,"HELLO",Toast.LENGTH_LONG).show();
            startActivity(Intent(this, CoronaDua::class.java))
        }

        //FOR DUA BUTTON
        duas_btn.setOnClickListener {

            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()

            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdLoaded() {
                    // Code to be executed when an ad finishes loading.
                }

                override fun onAdFailedToLoad(errorCode: Int) {
                    // Code to be executed when an ad request fails.
                }

                override fun onAdOpened() {
                    // Code to be executed when the ad is displayed.
                }

                override fun onAdClicked() {
                    // Code to be executed when the user clicks on an ad.
                }

                override fun onAdLeftApplication() {
                    // Code to be executed when the user has left the app.
                }

                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    startActivity(Intent(this@Home, Duas::class.java))
                }
            }

        }

        //FOR TASBEEH COUNTER
        tasbeeh_counter_btn.setOnClickListener {
            startActivity(Intent(this, TasbeehCounter::class.java))
        }

        //FOR SURAH
        qurans_btn.setOnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()

            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }


            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdLoaded() {
                    // Code to be executed when an ad finishes loading.
                }

                override fun onAdFailedToLoad(errorCode: Int) {
                    // Code to be executed when an ad request fails.
                }

                override fun onAdOpened() {
                    // Code to be executed when the ad is displayed.
                }

                override fun onAdClicked() {
                    // Code to be executed when the user clicks on an ad.
                }

                override fun onAdLeftApplication() {
                    // Code to be executed when the user has left the app.
                }

                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    startActivity(Intent(this@Home, Quran::class.java))
                }
            }
        }

    }
}
