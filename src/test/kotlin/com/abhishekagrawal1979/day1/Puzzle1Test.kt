package com.abhishekagrawal1979.day1

import com.abhishekagrawal1979.day1.Puzzle1.findPairs
import com.abhishekagrawal1979.day1.Puzzle1.isSum2020
import com.abhishekagrawal1979.day1.Puzzle1.productOfTwoNumbers
import com.abhishekagrawal1979.day1.Puzzle1.sumOfTwoNumber
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
internal class Puzzle1Test {


    @Test
    fun `should return a sum of 2 numbers`() {
        val number1 = 5
        val number2 = 6
        val sum = sumOfTwoNumber(number1,number2)

        assertEquals(11,sum)

    }

    @Test
    fun `should return a list of pairs of all possible pairs of number from a list`(){
        val expenseList = listOf(1,2,3)
        val samplePairList = listOf(Pair(1,2), Pair(1,3), Pair(2,3))
        val pairList = findPairs(expenseList)
        assertEquals(pairList,samplePairList)
    }

    @Test
    fun `should return true if the sum is 2020`(){

        val pair1 = Pair(1000, 2000)
        val pair2 = Pair(1000, 2020)
        val isValidPair = isSum2020(pair1)
        val isValidPair2 = isSum2020(pair2)
        assertEquals(null,isValidPair)
        assertEquals(null,isValidPair2)
    }

    @Test
    fun `should return product of 2 numbers`(){
        val number1 =1000
        val number2 = 1020
        val product = productOfTwoNumbers(number1,number2)
    }

}

