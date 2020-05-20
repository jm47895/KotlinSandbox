class Functions{

    fun sumOfTwoNums(a: Int, b: Int): Int{ //This returns an explicit type
        return a + b
    }

    fun inferredSumOfTwoNums(a: Int, b: Int) = a+b //This returns an inferred type

    fun printSumNoReturn(a: Int, b: Int): Unit{ //This returns an void type
        println("sum of $a and $b is ${a+b}")
    }

    fun printInferredSumNoReturn(a: Int, b: Int){ //This returns an inferred void type
        println("sum of $a and $b is ${a+b}")
    }

    /*
        Functions can have default values in the parameters. If no default value is specified, it must be declared
        explicitly in the function call parameter
     */
    fun defaultValuesForParametersFun (a: Int = 0, b: Int = 0, c: Int = 0, d: Int){
        println("sum of $a and $b and $c and $d is ${a+b+c+d}")
    }
}