

fun main(){

    println("Hello world")

    println(Functions().sumOfTwoNums(2,3 )) //Create objects of classes using "Function()"
    println(Functions().inferredSumOfTwoNums(2, 3)) //Use the dot operator to access member functions
    Functions().printSumNoReturn(4,5) //and call them
    Functions().printInferredSumNoReturn(4,5)//

    val add = Functions().sumOfTwoNums(6 , 10) //Variables can be assigned functions
    println(add)

    /*
    Positional arguments should be called before named arguments
     */
    Functions().defaultValuesForParametersFun(5, 7, 9, 1)
    Functions().defaultValuesForParametersFun(1, d = 4)
    Functions().defaultValuesForParametersFun(5, 7, d = 6)
    Functions().defaultValuesForParametersFun(5, c = 3, d = 9)

}

