package com.lepesaurion.unitconverter

/**
 *
 * Título del proyecto: UnitConverter
 * Descripción: Aplicación para conversión de unidades
 * Autor: Luis Ortega Lepe
 * Emailo: a.ortega.lepe@gmail.com
 */

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.lepesaurion.unitconverter.databinding.ActivityMainBinding



class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el dropdown para el tipo de conversion
        val conversionTypes = resources.getStringArray(R.array.conversiotn_types)
        val conversionAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, conversionTypes)
        binding.dropdownConversionType.setAdapter(conversionAdapter)

        // Configurar el dropdown para la unidades
        binding.dropdownConversionType.setOnItemClickListener { _, _, position, _ ->
            val unitsArray = when (position) {
                0 -> R.array.units_length
                1 -> R.array.units_mass
                2 -> R.array.units_volume
                else -> R.array.units_length
            }

            // Se reinicia los campos de unidad, valor y resultado.
            binding.dropdownUnits.setText("")
            binding.editValue.setText("")
            binding.textViewResult.text = ""
            val units = resources.getStringArray(unitsArray)
            val unitsAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, units)
            binding.dropdownUnits.setAdapter(unitsAdapter)
        }

        // Configurar el botón de conversión
        binding.buttonConvert.setOnClickListener {
            val inputValue = binding.editValue.text.toString().toDoubleOrNull()
            if (inputValue == null) {
                Toast.makeText(this, "Por favor, ingresa un valor válido.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedUnit = binding.dropdownUnits.text.toString()
            val result = when (selectedUnit) {
                // Longitud
                "Kilómetros a Millas" -> UnitConverter.kilometersToMiles(inputValue)
                "Metros a Pies" -> UnitConverter.metersToFeet(inputValue)
                "Centímetros a Pulgadas" -> UnitConverter.centimetersToInches(inputValue)

                // Masa
                "Kilogramos a Libras" -> UnitConverter.kilogramsToPounds(inputValue)
                "Gramos a Onzas" -> UnitConverter.gramsToOunces(inputValue)
                "Toneladas a Toneladas Cortas" -> UnitConverter.tonsToShortTons(inputValue)

                // Volumen
                "Litros a Galones" -> UnitConverter.litersToGallons(inputValue)
                "Mililitros a Onzas Líquidas" -> UnitConverter.millilitersToFluidOunces(inputValue)
                "Metros Cúbicos a Pies Cúbicos" -> UnitConverter.cubicMetersToCubicFeet(inputValue)

                else -> 0.0
            }

            binding.textViewResult.text = "Resultado: $result"
        }
    }
}