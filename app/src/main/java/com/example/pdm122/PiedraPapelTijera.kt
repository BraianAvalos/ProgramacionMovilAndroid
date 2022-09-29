package com.example.pdm122

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class PiedraPapelTijera : AppCompatActivity() {
    private var mSensorManager : SensorManager? = null
    private var mSensorListener : ShakeEventListener? = null
    internal lateinit var imgVEleccion: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piedra_papel_tijera)
        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener()
        imgVEleccion = findViewById(R.id.imgVSeleccion)
        val btnIniciar: Button =findViewById(R.id.btnIniciarRockPaper)
        this.mSensorListener!!.setOnShakeListener {
            Randomizer()
            Log.d("","")
        }
        btnIniciar.setOnClickListener {
            Randomizer()
        }
    }
    fun Randomizer(){
         var randomSelect = (1..3).random()
        Log.d("Mensaje","BotonPresionado ${randomSelect}")

        when(randomSelect){
            1 -> imgVEleccion.setImageResource(R.drawable.rock)
            2 -> imgVEleccion.setImageResource(R.drawable.paper)
            3 -> imgVEleccion.setImageResource(R.drawable.scissors)
        }
    }
    override fun onResume(){
        super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )
    }
    override fun onPause(){
        mSensorManager!!.unregisterListener(mSensorListener)
        super.onPause()
    }
}