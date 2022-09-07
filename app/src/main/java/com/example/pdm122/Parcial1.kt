package com.example.pdm122

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class Parcial1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcial1)
       var layout : ConstraintLayout = findViewById(R.id.layoutManzanas)
        var btnCalcular:Button = findViewById(R.id.btnCalcularManzanas)
        var btnM5:Button= findViewById(R.id.btnM5)
        var btnM15:Button= findViewById(R.id.btnM15)
        var btnM30:Button= findViewById(R.id.btnM30)
        var btnM50:Button= findViewById(R.id.btnM50)
        var edtPa: EditText = findViewById(R.id.edtPActual)
        var edtPt: EditText = findViewById(R.id.edtPTotal)
        var edtP : EditText = findViewById(R.id.edtPorcen)
        var imgBtnCalPa: ImageButton = findViewById(R.id.imgCalPa)
        var imgBtnCalPt: ImageButton = findViewById(R.id.imgBtnCalPT)
        var prodTotal= 200
        var prodActual = 0
        var porcentaje = 0.0
        var manzanasA=0
        var manzanasT=0

        edtPt.setText(""+prodTotal)
        edtPa.setText(""+prodActual)
        edtP.setText(""+porcentaje)
        imgBtnCalPa.setOnClickListener {
            manzanasA=prodActual*80
            Toast.makeText(this,"Manzanas actuales: " +manzanasA,Toast.LENGTH_SHORT).show()
        }
        imgBtnCalPt.setOnClickListener {
            manzanasT = (edtPt.text.toString().toInt())*80
            Toast.makeText(this,"Manzanas actuales: " +manzanasT,Toast.LENGTH_SHORT).show()
        }

        btnM5.setOnClickListener {
            prodActual+=5
            edtPa.setText(""+prodActual)
        }
        btnM15.setOnClickListener {
            prodActual+=15
            edtPa.setText(""+prodActual)
        }
        btnM30.setOnClickListener {
            prodActual+=30
            edtPa.setText(""+prodActual)
        }
        btnM50.setOnClickListener {
            prodActual+=50
            edtPa.setText(""+prodActual)
        }


        btnCalcular.setOnClickListener {
            prodTotal = edtPt.text.toString().toInt()
            prodActual = edtPa.text.toString().toInt()
            porcentaje = (prodActual*100.0)/prodTotal
            if(porcentaje>=70){
                layout.setBackgroundColor(Color.RED)
            }
            edtP.setText(""+porcentaje)
        }




    }
}