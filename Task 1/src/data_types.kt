//1. Declare and initialize variables of the following types:
//- `Double`: Store a floating-point number.
//- `Boolean`: Store `true` or `false`.
//- `Char`: Store a single letter.
//2. Print each variable with a message describing its value.
//
//**Expected Output Example:**
//
//```kotlin
//The temperature is 36.5 degrees.
//Is it raining? false
//The first letter of my name is A.
//
//```

fun main() {
    var temperature: Double = 36.5;
    var isRaining: Boolean = false;
    var letter: Char = 'C';

    println("The temperature is $temperature degrees");
    println("Is it raining? $isRaining");
    println("The first letter of my name is $letter.");
}