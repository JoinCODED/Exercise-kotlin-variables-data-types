//Part 3: Type Inference
fun main() {
    val city = "New York"
    val temperature =22.5

    println("City:$city, Temperature: $temperature")
    println("Type of 'city': ${city::class.simpleName}")
    println("Type of 'temperature': ${temperature::class.simpleName}")

}