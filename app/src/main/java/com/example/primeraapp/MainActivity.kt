package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaración de las variables
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app","Estoy en el método onCreate")

        //Inicializar las variables
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)
        })

        segundoBoton.setOnClickListener {
            val miIntent2 = Intent(this,TerceraActivity::class.java)
            startActivity(miIntent2)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_app","Estoy en el método onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app", "Estoy en el método onPauset")
    }
}