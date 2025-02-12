//Part 4: Converting Data Types
fun main() {
    val numString: String = "100"  //Declare a String variable numString and assign it "100".
    val numInt: Int = numString.toInt()  //Convert numString to an Int and store it in numInt.

    val numInt2: Int = 50  //Declare an Int variable numInt2 and assign it 50.
    val numString2: String = numInt2.toString()  //Convert numInt2 to a String and store it in numString2.

    //Print both converted values.
    println("numInt is: $numInt")
    println("numString2 is: $numString2")

}