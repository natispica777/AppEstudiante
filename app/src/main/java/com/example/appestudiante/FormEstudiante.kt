package com.example.appestudiante

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FormEstudiante : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form_estudiante)

        val cedula = findViewById<EditText>(R.id.cedula)
        val nombre = findViewById<EditText>(R.id.nombre)
        val edad = findViewById<EditText>(R.id.edad)
        val correo = findViewById<EditText>(R.id.correo)
        val programa = findViewById<EditText>(R.id.programa)
        val direccion = findViewById<EditText>(R.id.direccion)

        val botonCrear = findViewById<Button>(R.id.crear)
        val botonSalir = findViewById<Button>(R.id.Salir)

        botonCrear.setOnClickListener {

            val intent = Intent(this, PerfilActivity::class.java)

            intent.putExtra("cedula", cedula.text.toString())
            intent.putExtra("nombre", nombre.text.toString())
            intent.putExtra("edad", edad.text.toString())
            intent.putExtra("correo", correo.text.toString())
            intent.putExtra("programa", programa.text.toString())
            intent.putExtra("direccion", direccion.text.toString())

            startActivity(intent)
        }

        botonSalir.setOnClickListener {
            finish()
        }
    }
}