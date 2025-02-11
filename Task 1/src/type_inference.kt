import kotlin.reflect.typeOf

fun main() {

    var city: String = "New York";
    var temperature: Double = 22.5;

    println("The type of city is class " + city::class.simpleName);
    println("The type of temperature is class kotlin." + temperature::class.simpleName)
}