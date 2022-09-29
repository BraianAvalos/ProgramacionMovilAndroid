package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private val questionBank = listOf(
    Question(R.string.questionMap, false),
    Question(R.string.questionTec, false),
    Question(R.string.questionDisney, true),
    Question(R.string.questionAvengers, true)
)
private lateinit var btnFalse:Button
private lateinit var btnTrue:Button
private lateinit var btnNext:Button
private lateinit var txtQuestion:TextView

private var index = 0
private var toastAns = 0
class GeoLocalizer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geo_localizer)
        btnFalse = findViewById(R.id.btnFalseQuestion)
        btnTrue = findViewById(R.id.btnTrueQuestion)
        btnNext = findViewById(R.id.btnNextQuestion)
        txtQuestion = findViewById(R.id.txtQuestion)

        txtQuestion.setText(questionBank[index].textResId)


        btnFalse.setOnClickListener {
        validateAnswer(false)
        }

        btnTrue.setOnClickListener {
        validateAnswer(true)
        }

        btnNext.setOnClickListener {
            updateQuestion()
        }

    }

    fun updateQuestion(){
        index++
        index = (index ++) % questionBank.count()
        txtQuestion.setText(questionBank[index].textResId)

    }

    fun validateAnswer(userAnswer: Boolean){

        if(userAnswer == questionBank[index].answer ){
            toastAns = R.string.correctToast;
            updateQuestion()
        }else{
            toastAns = R.string.badToast;
        }
        Toast.makeText(this, toastAns, Toast.LENGTH_SHORT).show()

    }
}