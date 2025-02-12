val greetSeaCreatures ={"Hello, Deep Sea Adventurer!"}
val findPearl ={num:Int ->  (num*num)}
//val findPearl: Int {num -> num*num}
val divideTreasure = {num:Double, num2:Double -> num/num2}

fun main()
{
    println( greetSeaCreatures())
    println(findPearl(6))
    println(divideTreasure(1000.0,5.0))
}