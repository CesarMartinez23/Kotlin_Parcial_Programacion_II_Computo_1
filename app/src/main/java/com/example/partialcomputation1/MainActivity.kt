package com.example.partialcomputation1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumberoOne = findViewById<EditText>(R.id.txtNumeroOne)
        val txtNumberoTwo = findViewById<EditText>(R.id.txtNumeroTwo)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        var suma :Int
    }
}