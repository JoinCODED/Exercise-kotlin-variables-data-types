import kotlin.reflect.typeOf

// **Task:**

// 1. Declare a variable `city` without specifying the type, and assign it `"New York"`.
// 2. Declare a variable `temperature` without specifying the type, and assign it `22.5`.
// 3. Print both variables and their inferred types using `.javaClass.kotlin`.

// **Expected Output Example:**

// ```kotlin
// The type of city is class kotlin.String
// The type of temperature is class kotlin.Double

// ```

fun main() {

    var city: String = "New York";
    var temperature: Double = 22.5;

    println("The type of city is class " + city::class.simpleName);
    println("The type of temperature is class kotlin." + temperature::class.simpleName)
}