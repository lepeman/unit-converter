package com.lepesaurion.unitconverter

object UnitConverter {

    // Constantes para factores de conversión de longitud
    private const val KM_TO_MILES = 0.621371
    private const val M_TO_FEET = 3.28084
    private const val CM_TO_INCHES = 0.393701

    // Constantes para factores de conversión de masa
    private const val KG_TO_POUNDS = 2.20462
    private const val G_TO_OUNCES = 0.035274
    private const val TON_TO_SHORT_TON = 1.10231

    // Constantes para factores de conversión de volumen
    private const val L_TO_GALLONS = 0.264172
    private const val ML_TO_FL_OUNCES = 0.033814
    private const val CUBIC_M_TO_CUBIC_FEET = 35.3147

    // Funciones para convertir longitud
    fun kilometersToMiles(value: Double): Double = value * KM_TO_MILES
    fun metersToFeet(value: Double): Double = value * M_TO_FEET
    fun centimetersToInches(value: Double): Double = value * CM_TO_INCHES

    // Funciones para convertir masa
    fun kilogramsToPounds(value: Double): Double = value * KG_TO_POUNDS
    fun gramsToOunces(value: Double): Double = value * G_TO_OUNCES
    fun tonsToShortTons(value: Double): Double = value * TON_TO_SHORT_TON

    // Funciones para convertir volumen
    fun litersToGallons(value: Double): Double = value * L_TO_GALLONS
    fun millilitersToFluidOunces(value: Double): Double = value * ML_TO_FL_OUNCES
    fun cubicMetersToCubicFeet(value: Double): Double = value * CUBIC_M_TO_CUBIC_FEET
}