fun main(){
    var score:Int= 97
    if(score>=90) {
        println("Grade:A")
    }else {
        if (score in 80..89) {
            println("Grade:B)")
        }else{
            if(score in 70..79){
                println("Grade:C")
            }else{
                if(score in 60..69) {
                    println("Grade:D")
                }else{
                    println("Grade:F")
                }

            }


        }
    }
}