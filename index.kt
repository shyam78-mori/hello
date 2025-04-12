// fun reverseString(input: String): String {
//     var result = ""
//     for (i in input.length - 1 downTo 0) {
//         result += input[i]
//     }
//     return result
// }

// fun main(args: Array<String>) {
//     val original = "Hello, Kotlin!"
//     val reversed = reverseString(original)
//     println("Original: $original")
//     println("Reversed: $reversed")
// }



// fun calculateAverage(vararg numbers: Double): Double {
//     if (numbers.isEmpty()){
//         return 0.0
//     } 

//     var sum = 0.0
//     for (num in numbers) {
//         sum += num
//     }
//     return sum / numbers.size
// }

// fun main() {
//     val avg1 = calculateAverage(10.0, 20.0, 30.0)
//     val avg2 = calculateAverage()
    
//     println("Average 1: $avg1")  
//     println("Average 2: $avg2")  
// }


// // fun main() {
// //     val numbers = listOf(1, 2, 2, 3, 4, 4, 5, 1)
// //     val uniqueNumbers = numbers.toSet().toList()

// //     println("Original List: $numbers")
// //     println("List without duplicates: $uniqueNumbers")
// // }



fun main() {
    val n = 5 
    var num = 1

    for (i in 1..n) {
        for (j in 1..i) {
            print("$num ") 
            num++
        }
        println() 
    }
}





fun main() {

    println("Pattern 1 : ")
    for(i in 5 downTo 1) {
        for(j in 1..5) {
            if(i == j) {
                print("$")
            }
            else {
                print("*")
            }
        }
        println("")
    } 
    
    
}println("Hello, World!")


    
    println("\n\nPattern 2 :")
    for(i in 1..5) {
        for(j in 1..5) {
            if(i == j) {
                print("$")
            }
            else {
                print("*")
            }
        }
        println("")
    }
}




fun greet(name: String): String {
    return "Hello, $name!"
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}






fun main() {
    for(i in 5 downTo 1){
        for(j in 1..5){
            if(i == j){
                print("$")
            }
            else{
                print("*")
            }
        }
        println()
    }

}