package com.example.test

//import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd

class MainActivity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        setContentView(R.layout.activity_main);
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        val startBtn = findViewById<Button>(R.id.start_btn);
        startBtn.setOnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()

            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
//            Toast.makeText(this@MainActivity ,"Your Clicked",Toast.LENGTH_LONG).show();
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
                val intent = Intent(this@MainActivity, Home::class.java)
                startActivity(intent)
            }
        }
    }
}
