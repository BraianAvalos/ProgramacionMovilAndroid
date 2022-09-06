package com.example.pdm122

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class TimeFigther : AppCompatActivity() {
    internal lateinit var btnTap:Button
    internal  lateinit var txtVScore:TextView
    internal lateinit var txtVCounter:TextView

    var score:Int=0;

    var initialCount:Long =5000
    var countInterval:Long =500
     private var startMusica: MediaPlayer? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_figther)

        btnTap=findViewById(R.id.btnTap)
        txtVScore=findViewById(R.id.txtVTapCounter)
        txtVCounter=findViewById(R.id.txtVDownCounter)
        startMusica = MediaPlayer.create(this, R.raw.musica)
        btnTap.setOnClickListener {
            if (score ===0){
                iniciarJuego()
                timer()
            }
           agregarScore()

        }
    }
    private fun iniciarJuego(){
        txtVScore.text = getString(R.string.score,"0")
        startMusica?.start()
    }
    private fun agregarScore(){
        score++
        txtVScore.text = getString(R.string.score,score.toString())
    }
    private fun timer(){
        object : CountDownTimer(initialCount, countInterval) {

            override fun onTick(millisUntilFinished: Long) {
                var actual:Long =millisUntilFinished/1000
                txtVCounter.text = getString(R.string.time_left,actual.toString())
            }

            override fun onFinish() {
                end()
            }
        }.start()

    }
    private fun end(){
        Toast.makeText(this,getString(R.string.end_game,score.toString()),Toast.LENGTH_LONG).show()
        score=0
        btnTap.isEnabled=false

    }
}