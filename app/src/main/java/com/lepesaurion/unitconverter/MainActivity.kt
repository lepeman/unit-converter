package com.lepesaurion.unitconverter

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerConversionType = findViewById<Spinner>(R.id.spinner_conversion_type)
        val spinnerUnits = findViewById<Spinner>(R.id.spinner_units)
        val editTextValue = findViewById<EditText>(R.id.edit_value)
        val buttonConverter = findViewById<Button>(R.id.button_convert)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        // Configura los spinners
        spinnerConversionType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val unitsArray = when (position) {
                    0 -> R.array.units_length  // Longitud
                    1 -> R.array.units_mass     // Masa
                    2 -> R.array.units_volume   // Volumen
                    else -> R.array.units_length
                }
                ArrayAdapter.createFromResource(
                    this@MainActivity,
                    unitsArray,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    spinnerUnits.adapter = adapter
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Configura el botón
        buttonConverter.setOnClickListener {
            val inputValue = editTextValue.text.toString().toDoubleOrNull()
            if (inputValue == null) {
                Toast.makeText(this, "Por favor, ingresa un valor válido.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedUnit = spinnerUnits.selectedItem.toString()
            val result = when (selectedUnit) {
                "Kilómetros a Millas" -> inputValue * 0.621371
                "Metros a Pies" -> inputValue * 3.28084
                "Centímetros a Pulgadas" -> inputValue * 0.393701
                else -> 0.0
            }

            textViewResult.text = "Resultado: $result"
        }
    }
}