package Leetcode

class MergeAlternatelySolution {

    fun mergeAlternately(word1: String, word2: String): String {

        var newString = ""
        val minStringLength = minOf(word1.length, word2.length)


        for(i in 0 until minStringLength){
            newString = newString.plus(word1[i]).plus(word2[i])
        }

        if(minStringLength == word1.length){
            newString = newString.plus(word2.substring(minStringLength))
        }else{
            newString = newString.plus(word1.substring(minStringLength))
        }

        return newString
    }
}