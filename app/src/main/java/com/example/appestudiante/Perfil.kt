package com.example.appestudiante

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val txtCedula = findViewById<TextView>(R.id.txtCedula)
        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val txtEdad = findViewById<TextView>(R.id.txtEdad)
        val txtCorreo = findViewById<TextView>(R.id.txtCorreo)
        val txtPrograma = findViewById<TextView>(R.id.txtPrograma)
        val txtDireccion = findViewById<TextView>(R.id.txtDireccion)

        txtCedula.text = "Identificación: " + intent.getStringExtra("cedula")
        txtNombre.text = "Nombre: " + intent.getStringExtra("nombre")
        txtEdad.text = "Edad: " + intent.getStringExtra("edad")
        txtCorreo.text = "Correo: " + intent.getStringExtra("correo")
        txtPrograma.text = "Programa: " + intent.getStringExtra("programa")
        txtDireccion.text = "Dirección: " + intent.getStringExtra("direccion")

        val botonVolver = findViewById<Button>(R.id.volver)

        botonVolver.setOnClickListener {
            finish()
        }
    }
}