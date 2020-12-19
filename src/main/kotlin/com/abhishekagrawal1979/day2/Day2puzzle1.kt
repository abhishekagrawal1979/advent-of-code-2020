package com.abhishekagrawal1979.day2

import com.abhishekagrawal1979.utility.FileReader

object puzzle1 {

    fun splitInputString(inputString: String): InputData {

        var inputArray = inputString.split(" ")
        return InputData(
            inputArray[0].split("-")[0].toInt(),
            inputArray[0].split("-")[1].toInt(),
            inputArray[1].substring(0, inputArray[1].length - 1),
            inputArray[2]
        )
    }

    fun validatePassword(passwordInput: InputData): Boolean {
        val regex = Regex(passwordInput.char)
        return ((regex.findAll(passwordInput.password).count() >= passwordInput.minOccurance) and
            (regex.findAll(passwordInput.password).count() <= passwordInput.maxOccurance)
        )
    }


}

data class InputData(val minOccurance: Int, val maxOccurance: Int, val char: String, val password: String)

fun main(){

    val passwordList = FileReader.listFromFile("src/main/resources/Day2Puzzle1.txt","string")

    println((passwordList.filter { puzzle1.validatePassword(puzzle1.splitInputString(it.toString())) }).size)

}