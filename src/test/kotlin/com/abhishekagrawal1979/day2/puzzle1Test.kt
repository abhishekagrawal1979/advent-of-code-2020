package com.abhishekagrawal1979.day2

import com.abhishekagrawal1979.day2.puzzle1.splitInputString
import com.abhishekagrawal1979.day2.puzzle1.validatePassword
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class puzzle1Test{

    @Test
    fun `should split the input string into char, min and max appearance and the password string`(){

        val inputString = "1-3 a: abcde"
        val inputData:InputData=  splitInputString(inputString)
        assert(inputData== InputData(1,3,"a","abcde"))
    }

    @Test
    fun `Should check password for validity and  return true for valid password`(){

        val passwordInput = InputData(1,3,"a","abcdaae")
        val isValid = validatePassword(passwordInput)
        assert(isValid)
    }
}