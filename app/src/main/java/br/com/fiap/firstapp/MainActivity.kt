package br.com.fiap.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonRolarDados)
        val textView = findViewById<TextView>(R.id.textViewNumero)

        button.setOnClickListener(){

            val numero = (1..6).random()
            textView.text = "$numero"
        }
    }
}
