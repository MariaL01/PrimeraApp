package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    //Declaración de Variables
    lateinit var btnInicio2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        //Inicialización
        btnInicio2 = findViewById(R.id.btnInicio2)

        btnInicio2.setOnClickListener(View.OnClickListener {
            val miIntent4 = Intent(this, MainActivity::class.java)
            startActivity(miIntent4)

        })



    }
}