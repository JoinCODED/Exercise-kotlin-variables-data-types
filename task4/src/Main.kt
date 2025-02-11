fun main() {
    println("Hello World!")
    val numString: String = "100"
    val numInt: Int = numString.toInt()
    val numInt2: Int = 50

    println("numString: $numString (Type: ${numString.javaClass.kotlin})")
    println("numInt: $numInt (Type: ${numInt.javaClass.kotlin})")
    println("numInt2: $numInt2 (Type: ${numInt2.javaClass.kotlin})")
}