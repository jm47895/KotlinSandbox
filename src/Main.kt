import Hackerrank.GradingStudentsSolution
import Leetcode.MaximumWealthSolution
import Leetcode.MergeAlternatelySolution
import Leetcode.balancedStringSplitSolution
import java.util.*

fun main(){

    val leetCode = MaximumWealthSolution()

    val customer1 = intArrayOf(2,8,7)
    val customer2 = intArrayOf(7,1,3)
    val customer3 = intArrayOf(1,9,5)

    val customerAccounts: Array<IntArray> = arrayOf(customer1, customer2, customer3)

    leetCode.maximumWealth(customerAccounts)


    /*println("Hello world")

    println(Functions().sumOfTwoNums(2,3 )) //Create objects of classes using "Function()"
    println(Functions().inferredSumOfTwoNums(2, 3)) //Use the dot operator to access member functions
    Functions().printSumNoReturn(4,5) //and call them
    Functions().printInferredSumNoReturn(4,5)//

    val add = Functions().sumOfTwoNums(6 , 10) //Variables can be assigned functions
    println(add)

    *//*
    Positional arguments should be called before named arguments
     *//*
    Functions().defaultValuesForParametersFun(5, 7, 9, 1)
    Functions().defaultValuesForParametersFun(1, d = 4)
    Functions().defaultValuesForParametersFun(5, 7, d = 6)
    Functions().defaultValuesForParametersFun(5, c = 3, d = 9)*/

}

