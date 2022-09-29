package com.example.pdm122

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Pokedex : AppCompatActivity() {
     private lateinit var layout: ConstraintLayout
     private lateinit var btnNext: Button
     private lateinit var txtVName: TextView
     private lateinit var imgVPokemon: ImageView

     var index = 0
     private val Pokemons = listOf (
         Pokemon("Articuno",R.drawable.articuno,true),
         Pokemon("Bayleef",R.drawable.bayleef,false),
         Pokemon("Beautifly",R.drawable.beautifly,false),
         Pokemon("Bonsly",R.drawable.bonsly,false),
         Pokemon("Charizard",R.drawable.charizard,false),
         Pokemon("Dewgong",R.drawable.dewgong,false),
         Pokemon("Espeon",R.drawable.espeon,false),
         Pokemon("Furret",R.drawable.furret,false),
         Pokemon("Houndoom",R.drawable.houndoom,false),
         Pokemon("Ivysour",R.drawable.ivysour,false),
         Pokemon("Lapras",R.drawable.lapras,false),
         Pokemon("Leafeon",R.drawable.leafeon,false),
         Pokemon("Lucario",R.drawable.lucario,false),
         Pokemon("Lugia",R.drawable.lugia,true),
         Pokemon("Marowak",R.drawable.marowak,false),
         Pokemon("Mewtwo",R.drawable.mewtwo,true),
         Pokemon("Munchlax",R.drawable.munchlax,false),
         Pokemon("Nidorina",R.drawable.nidorina,false),
         Pokemon("Ninetales",R.drawable.ninetales,false),
         Pokemon("Pidgeotto",R.drawable.pidgeotto,false),
         Pokemon("Snivy",R.drawable.snivy,false),
         Pokemon("Suicune",R.drawable.suicune,true),
         Pokemon("Togetic",R.drawable.togetic,false)
             )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)

        layout = findViewById(R.id.pokeLayout)
        btnNext = findViewById(R.id.btnNextPokemon)
        txtVName = findViewById(R.id.txtVPokeName)
        imgVPokemon = findViewById(R.id.imgVPokeVista)

        btnNext.setOnClickListener {
            nextPokemon()
        }

    }
    fun nextPokemon(){
        index++
        index = (index++) % Pokemons.count()
        imgVPokemon.setImageResource(Pokemons[index].imgPokeId)
        txtVName.setText(Pokemons[index].strNombre)
        if (Pokemons[index].isLegendary){
            layout.setBackgroundColor(Color.RED)
        }else{
            layout.setBackgroundColor(Color.WHITE)
        }
    }

}