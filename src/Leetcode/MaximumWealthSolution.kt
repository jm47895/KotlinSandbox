package Leetcode

class MaximumWealthSolution {
    fun maximumWealth(accounts: Array<IntArray>): Int {

        var maxWealth = 0

        for(account in accounts){

            var total = 0

            for(amt in account){

                total += amt

                maxWealth = maxOf(maxWealth, total)
            }
        }

        println(maxWealth)

        return maxWealth
    }
}