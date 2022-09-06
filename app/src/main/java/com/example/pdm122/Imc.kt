package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)
        val edtPeso:EditText = findViewById(R.id.edtPeso)
        val edtEstatura:EditText = findViewById(R.id.edtEstatura)
        val txtVResul:TextView = findViewById(R.id.txtVResul)
        val btnCalcular:Button = findViewById(R.id.btnCalcularImc)
        var resultado=0.0
        val txtVRecom:TextView=findViewById(R.id.txtVRecomendacion)
        var estatusDelPaciente=""
        btnCalcular.setOnClickListener {
            if (!edtPeso.text.isEmpty() && !edtEstatura.text.isEmpty()){
                resultado = edtPeso.text.toString().toDouble()/(edtEstatura.text.toString().toDouble()*edtEstatura.text.toString().toDouble())
                if(resultado>=19 && resultado<=24.9){
                    estatusDelPaciente="El paciente se encuentra en el peso adecuado"
                }else{
                    estatusDelPaciente="El paciente NO se encuentra en el peso adecuado"
                }
                txtVRecom.text=estatusDelPaciente
                txtVResul.text=resultado.toString()
            }else{
                Toast.makeText(this, "Introduce los datos requeridos",Toast.LENGTH_SHORT).show()
            }


        }

    }
}