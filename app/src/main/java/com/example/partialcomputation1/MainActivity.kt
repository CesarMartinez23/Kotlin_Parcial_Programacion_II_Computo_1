package com.example.partialcomputation1

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumberoOne = findViewById<EditText>(R.id.txtNumeroOne)
        val txtNumberoTwo = findViewById<EditText>(R.id.txtNumeroTwo)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        var suma :Int


        btnSumar.setOnClickListener {

            if (txtNumberoOne.text.isNotEmpty() && txtNumberoTwo.text.isNotEmpty()) {
                suma = (txtNumberoOne.text.toString()).toInt() + (txtNumberoTwo.text.toString()).toInt()
                txtResultado.text = "The result is: $suma"
                txtResultado.setTextColor(Color.parseColor("#008000"))
            }else {
                if (txtNumberoOne.text.isNotEmpty() && txtNumberoTwo.text.isEmpty()) {
                    txtResultado.text = "El Resultado es: ${txtNumberoOne.text}"
                    txtResultado.setTextColor(Color.parseColor("#FF8000"))
                }else if (txtNumberoOne.text.isEmpty() && txtNumberoTwo.text.isNotEmpty()){
                    txtResultado.text = "El Resultado es: ${txtNumberoTwo.text}"
                    txtResultado.setTextColor(Color.parseColor("#FF8000"))
                }else{
                    txtResultado.text = "Datos Erroneos"
                    txtResultado.setTextColor(Color.parseColor("#FF0000"))
                }
            }
        }
    }
}