package com.example.ejemplocrud

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

private lateinit var Image: ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pal splash screensampas la imagen que quieras poner
        Image=findViewById(R.id.SplashScreenImage)
        //Vamo a hacer una animacion, vamos a hacer que a imagen aparezca transparente
        Image.alpha=0f
        //Y con esta otra onda vamos a hacer que se vaya haciendo visible con la veocidad de 1500ms
        Image.animate().setDuration(1500).alpha(1f).withEndAction{
            //Cuando a animacion termine, se va a abrir la otra pantalla con este intent
            val i = Intent(this, Productos_Main::class.java)
            startActivity(i)
            //Y esto la verdad no se para que es pero ahi ta XD
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            //Y finlaizas la activity para que no se ejecute en segundo pano y para que cuando le des
            //para atras, que no salga la splashcreen
            finish()
        }

    }
}