package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sumar2Numeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumar2_numeros)

        var edtTextNum1: EditText = findViewById(R.id.edtTextNumero1)
        var edtTextNum2: EditText = findViewById(R.id.edtTextNumero2)
        val btnSumar: Button = findViewById(R.id.btnSumarNumeros)
        var numero1=0
        var numero2=0
        var resultado=0


        btnSumar.setOnClickListener() {
            numero1=Integer.parseInt(edtTextNum1.getText().toString())
            numero2=Integer.parseInt(edtTextNum2.getText().toString())
            resultado=numero1+numero2
            Toast.makeText(this,"El resultado de la suma $numero1 + $numero2 es = $resultado",Toast.LENGTH_LONG).show()
        }

    }
}