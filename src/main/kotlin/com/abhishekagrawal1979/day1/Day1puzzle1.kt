package com.abhishekagrawal1979.day1


import com.abhishekagrawal1979.day1.Puzzle1.findPairs
import com.abhishekagrawal1979.day1.Puzzle1.isSum2020
import com.abhishekagrawal1979.day1.Puzzle1.listFromFile
import com.abhishekagrawal1979.day1.Puzzle1.productOfTwoNumbers
import java.io.File

object Puzzle1 {

    fun listFromFile(fileName: String): List<Int> {
        val templist = File(fileName).readLines()
        return templist.map { it.toInt() }
    }


    fun sumOfTwoNumber(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun findPairs(expenseList: List<Int>): List<Pair<Int, Int>> {
        val pairList = mutableListOf<Pair<Int, Int>>()
        for (i in expenseList.indices) {
            for (j in i + 1 until expenseList.size)
                pairList.add(Pair(expenseList[i], expenseList[j]))
        }
        return pairList
    }

    fun isSum2020(pair1: Pair<Int, Int>): Pair<Int, Int>? {

        return when (pair1.first + pair1.second) {
            2020 -> pair1
            else -> null
        }
    }

    fun productOfTwoNumbers(number1: Int, number2: Int): Int {
        return number1 * number2

    }
}

fun main() {

    val expenseList = listFromFile("src/main/resources/expenselist.txt")

    val pairlist = findPairs(expenseList)
    val goodPair = pairlist.filter { isSum2020(it) !=null }
    println(productOfTwoNumbers(goodPair[0].first,goodPair[0].second))


}

