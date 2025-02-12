fun main ()
{
    println( greetTraveler())
    println(findOasis(10.0,20.0))
    println(currentTemperature(25,40))
}


fun greetTraveler():String {
    return("Welcome to the Desert, Traveler!")
}

fun findOasis(x:Double , y:Double):String
{
    return("Oasis found at coordinates ($x, $y)")
}

fun currentTemperature(morningTemperature: Int , afternoonTemperature: Int): String
{
    var v: Double

    v = (morningTemperature.toDouble()+afternoonTemperature.toDouble())/2
    return("Average temp is $v")
}
