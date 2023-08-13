package com.example.ejemplocrud

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var producto:TextView
private lateinit var precio:TextView
private lateinit var categoria:TextView
private lateinit var back:TextView

class Productos_Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos_info)

        // Obtener los parámetros del intent
        val nombre = intent.getStringExtra("nomb")
        val clasificacion = intent.getStringExtra("cat")
        val price = intent.getStringExtra("price")

        producto=findViewById(R.id.ProductosInfo_Producto)
        precio=findViewById(R.id.ProductosInfo_Precio)
        categoria=findViewById(R.id.ProductosInfo_Categoria)
        back=findViewById(R.id.ProductosInfo_Back)

        producto.setText(nombre)
        precio.setText(price)
        categoria.setText(clasificacion)

        back.setOnClickListener {
            finish()
        }
    }
}