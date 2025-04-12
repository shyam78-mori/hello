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
        println("*")
    }

}