fun main(){
    var numString = "100"
    var numInt:Int = numString.toInt()

    var numInt2 = 50
    var numString2:String = numInt2.toString()

    println("numInt is:$numInt " + numString2.javaClass.kotlin) //printing data type just in case")
    println("numString2 is: $numString2 " + numString2.javaClass.kotlin) //printing data type just in case
}