/*
 * Author: [Yousef Alothman]
 * Date: [2025-02-11]  // Update with the current date
 * Description: Part 2 - Immutable vs Mutable Variables
 * This program demonstrates the difference between mutable (var) and immutable (val) variables in Kotlin.
 */

fun main() {

  var score: Int = 10
  score = 20

  val greeting: String = "Hello, Kotlin!"

  println(score)
  println(greeting)

  /*

  greeting = "Hello Coded" // this cannot be done val types are not chanagble!

   */

}

