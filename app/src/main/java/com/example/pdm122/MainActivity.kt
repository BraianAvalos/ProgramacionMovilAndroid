package com.example.pdm122

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button =findViewById(R.id.btnOcultar)
        val btnVolver: Button =findViewById(R.id.btnVisible)
        val imgHola:ImageView= findViewById(R.id.imageView2)
        val btnToast:Button =findViewById(R.id.btnToastView)
        val btnSumar:Button=findViewById(R.id.btnSumarActivity)
        val btnImc:Button=findViewById(R.id.btnImc)
        val btnTime:Button=findViewById(R.id.btntimefighterActivity)

        btn.setOnClickListener{
            imgHola.isVisible=false
        }
        btnVolver.setOnClickListener(){
            imgHola.isVisible=true
        }
        btnToast.setOnClickListener(){
            val intent=Intent(this,ToastActivity::class.java).apply {  }
            startActivity(intent)
        }
        btnSumar.setOnClickListener {
            val intent=Intent(this,Sumar2Numeros::class.java).apply {  }
            startActivity(intent)
        }
        btnImc.setOnClickListener {
            val intent=Intent(this,Imc::class.java).apply {  }
            startActivity(intent)
        }
        btnTime.setOnClickListener {
            val intent=Intent(this,TimeFigther::class.java).apply {  }
            startActivity(intent)
        }
    }
}