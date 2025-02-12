/* File: type_inference.kt
* Author: [Yousef Alothman]
* Date: [2-11-2025]
* Description: Demonstrates Kotlin's type inference by declaring variables
* without explicitly specifying their types and printing their inferred types.
*/


fun main() {

  var city = "New York"
  var temperature = 22.5

  println("The type of city is ${city.javaClass.kotlin}")
  println("The type of temperature is ${temperature.javaClass.kotlin}")
}

