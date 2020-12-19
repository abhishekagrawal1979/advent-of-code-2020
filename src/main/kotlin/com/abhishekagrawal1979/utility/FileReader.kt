package com.abhishekagrawal1979.utility

import java.io.File

object FileReader {

    fun listFromFile(fileName: String, type: String): List<Any> {
        val templist = File(fileName).readLines()
        return when (type) {
            "int" -> templist.map { it.toInt() }
            "string" -> templist.map { it }
            else -> emptyList()
        }

    }

}