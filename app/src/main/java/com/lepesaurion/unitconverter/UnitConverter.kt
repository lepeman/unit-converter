package com.lepesaurion.unitconverter

/**
 *
 * Título del proyecto: UnitConverter
 * Descripción: Aplicación para conversión de unidades
 * Autor: Luis Ortega Lepe
 * Emailo: a.ortega.lepe@gmail.com
 */

/**
 *
 * `UnitConverter` es un [object] que crea una única instancia y entrega las funciones encargadas de
 * los cálculos de conversión entre las diferentes unidades.
 */
object UnitConverter {

    // ----------------------------------------------------
    //  Constantes para factores de conversión de longitud
    // ----------------------------------------------------

    /* Factor de conversión de Kilómetros a Millas */
    private const val KM_TO_MILES = 0.621371

    /* Factor de conversión de Metros a Pies */
    private const val M_TO_FEET = 3.28084

    /* Factor de conversión de Centímetros a Pulgadas */
    private const val CM_TO_INCHES = 0.393701

    // ----------------------------------------------------
    //  Constantes para factores de conversión de longitud
    // ----------------------------------------------------

    /* Factor de conversión de Kilogramos a Libras */
    private const val KG_TO_POUNDS = 2.20462

    /* Factor de conversión de Kilogramos a Libras */
    private const val G_TO_OUNCES = 0.035274

    /* Factor de conversión de Kilogramos a Libras */
    private const val TON_TO_SHORT_TON = 1.10231

    // ----------------------------------------------------
    //  Constantes para factores de conversión de longitud
    // ----------------------------------------------------

    /* Factor de conversión de Kilogramos a Libras */
    private const val L_TO_GALLONS = 0.264172

    /* Factor de conversión de Kilogramos a Libras */
    private const val ML_TO_FL_OUNCES = 0.033814

    /* Factor de conversión de Kilogramos a Libras */
    private const val CUBIC_M_TO_CUBIC_FEET = 35.3147

    // -----------------------------------------------
    //      Funciones para conversión de longitud
    // -----------------------------------------------

    /**
     * Convierte kilómetros a millas.
     *
     * @param value - [Double] El valor en kilómetros.
     * @return [Double] Retorna el valor convertido a millas.
     */
    fun kilometersToMiles(value: Double): Double = value * KM_TO_MILES

    /**
     * Convierte Metros a Pies.
     *
     * @param value - [Double] El valor en metros.
     * @return [Double] Retorna el valor convertido a Pies.
     */
    fun metersToFeet(value: Double): Double = value * M_TO_FEET

    /**
     * Convierte kilómetros a millas.
     *
     * @param value - [Double] El valor en Centímetros.
     * @return [Double] Retorna el valor convertido a Pulgadas.
     */
    fun centimetersToInches(value: Double): Double = value * CM_TO_INCHES

    // -----------------------------------------------
    //      Funciones para conversión de masa
    // -----------------------------------------------

    /**
     * Convierte Kilógramos a Libras.
     *
     * @param value - [Double] El valor en Kilogramos.
     * @return [Double] Retorna el valor convertido a Libras.
     */
    fun kilogramsToPounds(value: Double): Double = value * KG_TO_POUNDS

    /**
     * Convierte Gramos a Onzas.
     *
     * @param value - [Double] El valor en Gramos.
     * @return [Double] Retorna el valor convertido a Onzas.
     */
    fun gramsToOunces(value: Double): Double = value * G_TO_OUNCES

    /**
     * Convierte Toneladas a Toneladas Cortas.
     *
     * @param value - [Double] El valor en Toneladas.
     * @return [Double] Retorna el valor convertido a Toneladas Cortas.
     */
    fun tonsToShortTons(value: Double): Double = value * TON_TO_SHORT_TON

    // -----------------------------------------------
    //      Funciones para conversión de volumen
    // -----------------------------------------------

    /**
     * Convierte Litros a Galones.
     *
     * @param value - [Double] El valor en Litros.
     * @return [Double] Retorna el valor convertido a Galones.
     */
    fun litersToGallons(value: Double): Double = value * L_TO_GALLONS

    /**
     * Convierte Milílitros a Onzas Líquidas.
     *
     * @param value - [Double] El valor en Milílitros.
     * @return [Double] Retorna el valor convertido a Onzas Líquidas.
     */
    fun millilitersToFluidOunces(value: Double): Double = value * ML_TO_FL_OUNCES

    /**
     * Convierte Metros Cúbicos a Pies Cúbicos.
     *
     * @param value - [Double] El valor en Metros Cúbicos.
     * @return [Double] Retorna el valor convertido a Pies Cúbicos.
     */
    fun cubicMetersToCubicFeet(value: Double): Double = value * CUBIC_M_TO_CUBIC_FEET
}