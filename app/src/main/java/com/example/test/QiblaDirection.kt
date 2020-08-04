package com.example.test

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.Sensor.TYPE_ORIENTATION
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.*
import kotlinx.android.synthetic.main.activity_qibla_direction.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlin.math.cos
import kotlin.math.sin

class QiblaDirection : AppCompatActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private lateinit var sensor: Sensor
    private var currentDegree = 0.0f
    private var currentDegreeNeedle = 0.0f
    private var REQUEST_CODE_LOCATION_PERMISSION = 1
    private var currentlatitude: Double = 0.0
    private var currentlongitude: Double = 0.0
    private var needleDegree = 0.0001f

    //globally declare fused LocationCLient
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    // globally declare LocationRequest
    private lateinit var locationRequest: LocationRequest

    // globally declare LocationCallback
    private lateinit var locationCallback: LocationCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qibla_direction)
        action_bar_title.text = "Qibla Direction"
        action_bar_back.setOnClickListener {
            finish()
        }

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManager.getDefaultSensor(TYPE_ORIENTATION) as Sensor


        if (ContextCompat.checkSelfPermission(this@QiblaDirection, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                this@QiblaDirection,
                arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE_LOCATION_PERMISSION
            )
        } else {
           getCurrentLocation()
        }

        if (sensor != null) {
            sensorManager.registerListener(this@QiblaDirection, sensor, SensorManager.SENSOR_DELAY_FASTEST)
//      } else {
            Toast.makeText(this@QiblaDirection, "Not Supported", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_LOCATION_PERMISSION && grantResults.size>0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getCurrentLocation()
            } else {
                Toast.makeText(this, "Permission Desnied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun getCurrentLocation() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(applicationContext)
        locationRequest = LocationRequest()
        locationRequest.interval = 50000
        locationRequest.fastestInterval = 50000
        locationRequest.smallestDisplacement = 170f // 170 m = 0.1 mile
        locationRequest.priority =
            LocationRequest.PRIORITY_HIGH_ACCURACY //set according to your app function
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                super.onLocationResult(locationResult)
                locationResult ?: return
//                LocationServices.getFusedLocationProviderClient(this@QiblaDirection)
//                    .removeLocationUpdates(this)
                if (locationResult.locations.isNotEmpty()) {
                    val location = locationResult.lastLocation
                    currentlatitude = location.latitude
                    currentlongitude = location.longitude
                    needleDegree =getDirection(currentlatitude,currentlongitude)
                }
            }
        }
    }

    //start location updates
    private fun startLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            Looper.getMainLooper() /* Looper */
        )
    }

    // stop location updates
    private fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    // stop receiving location update when activity not visible/foreground
    override fun onPause() {
        super.onPause()
        stopLocationUpdates()
    }

    // start receiving location update when activity  visible/foreground
    override fun onResume() {
        super.onResume()
        startLocationUpdates()
    }
    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (needleDegree != 0.0001f) {// var needledegree=getDirection(currentlatitude,currentlongitude).toFloat()
            val degree = event?.values?.get(0)?.let { Math.round(it).toFloat() }
            val rotateAnimation = RotateAnimation(
                currentDegree,
                -degree!!, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            )
            rotateAnimation.duration = 500
            rotateAnimation.fillAfter = true
            compass_layout.animation = rotateAnimation
            currentDegree = -degree
            qibla_indicator.rotation=needleDegree+90
//        currentDegree Needle= (-needleDegree).toFloat()
//        latlong.setText(""+needledegree)
        }
    }

    private fun getDirection(
        lat2: Double,
        lng2: Double
    ): Float {
        //MAKKA Lat Long
        val position_latitude = 21.427378
        val position_longitude = 39.814838

        //COnverstion of Makka and Current Lat long to radian
        val latitude1 = Math.toRadians(lat2)
        val longitude1 = Math.toRadians(lng2)
        val latitude2 = Math.toRadians(position_latitude)
        val longitude2 = Math.toRadians(position_longitude)

        //Delta of Long
        val dlong = Math.toRadians(longitude2 - longitude1)

        //Calculation of Angle
        val y = Math.sin(dlong) * Math.cos(latitude2)
        val x =
            cos(latitude1) * sin(latitude2) - sin(
                latitude1
            ) * cos(latitude2) * cos(dlong)
        //Getting angle in degrees
        var angle = Math.atan2(y, x)


        angle = if (angle < 0) Math.abs(angle) else 2 * Math.PI - angle

        Log.i("angle", "$angle in radians")

        angle = Math.toDegrees(angle)
        Log.i("angle", "$angle in degrees")

        latlong.setText(
            String.format(
                "Degree:%s",
                Math.ceil(angle)
            )
        )
        return angle.toFloat()//direction in degree
    }


}
