fun main(){
    var numString: String = "100"
    var numInt = numString.toInt()
    var numInt2: Int = 50
    var numString2 = numInt2.toString()
    println("numInt is: $numInt")
    println("numString2 is: \"$numString2\"")
    println(numString.javaClass.kotlin) //String
    println(numString2.javaClass.kotlin) //String
    println(numInt.javaClass.kotlin) //Int
    println(numInt2.javaClass.kotlin) //Int
}