fun main() {
    val conversionCtoF: (Double) -> Double = {
        (((9.0/5.0)*(it))+32)
    }
    val conversionKtoC: (Double) -> Double = {
        (it - 273.15)
    }
    val conversionFtoK: (Double) -> Double = {
        (((5.0/9.0)*(it - 32)) + 273.15)
    }
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", conversionCtoF )
    printFinalTemperature(350.0, "Kelvin", "Celsius", conversionKtoC )
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", conversionFtoK)
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}