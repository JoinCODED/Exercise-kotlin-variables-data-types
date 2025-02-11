//Task:
//Declare a String variable numString and assign it "100".
//Convert numString to an Int and store it in numInt.
//Declare an Int variable numInt2 and assign it 50.
//Convert numInt2 to a String and store it in numString2.
//Print both converted values.
//Hint: If you are not familiar with Converting data types try toGoogle it or ask us.
//Expected Output Example:
//numInt is: 100
//numString2 is: "50"


fun main() {
    var numString: String = "100";
    var numInt: Int = numString.toInt();
    var numInt2: Int = 50;
    var numString2: String = numInt2.toString();

    println("numInt is: $numInt");
    println("numString2 is: \"$numString2\"");
}