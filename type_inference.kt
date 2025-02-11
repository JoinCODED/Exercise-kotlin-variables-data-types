fun main() {
    var city = "New York"
    var temperature = 22.5
    val cityType = city.javaClass.kotlin
    val temperatureType = temperature.javaClass.kotlin

    println("The type of city is class $cityType")
    println("The type of temperature is class $temperatureType")
}

