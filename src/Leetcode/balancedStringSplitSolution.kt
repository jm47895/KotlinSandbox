package Leetcode

class balancedStringSplitSolution {

    /*Balanced strings are those who have equal quantity of 'L' and 'R' characters.
    Given a balanced string s split it in the maximum amount of balanced strings.
    Return the maximum amount of splitted balanced strings.

    Example 1:

    Input: s = "RLRRLLRLRL"
    Output: 4
    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

    Example 2:

    Input: s = "RLLLLRRRLR"
    Output: 3
    Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.*/

    fun balancedStringSplit(s: String): Int {

        var maxCount = 0
        var count = 0

        for(c in s){

            if(c == 'R')
                count++
            else
                count--

            if(count == 0)
                maxCount++
        }


        return maxCount
    }
}