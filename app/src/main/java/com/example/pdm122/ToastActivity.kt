package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        val btnToastLargo: Button =findViewById(R.id.btnToastLargo);
        val btnToastCorto: Button =findViewById(R.id.btnToastCorto);

        btnToastLargo.setOnClickListener{
            val name="Braian"
            Toast.makeText(this, "Toast largo: $name",Toast.LENGTH_LONG).show()
        }
        btnToastCorto.setOnClickListener{
            //toast corto
            Toast.makeText(this, "Toast corto",Toast.LENGTH_SHORT).show()

        }


    }
}