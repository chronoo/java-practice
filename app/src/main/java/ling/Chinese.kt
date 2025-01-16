package ling

import java.io.File

object Chinese {
    fun report() {
        val rads = File("app/src/main/resources/kanji/")
            .walk()
            .filter { it.isFile }
            .sortedBy { it.name }
//            .take(1)
            .associate { file ->
                val text = file.readText()
                val blocks = text.split("\r\n\r\n")
                val stat = blocks.flatMap { block ->
                    val (first, second) = block.split("\r\n")
                    val key = first[0]
                    val kanjis = second.split(", ").map { it[0] }
                    kanjis
                }
                file.nameWithoutExtension.toInt() to stat
            }

        println(rads.mapValues { it.value.size })
    }
}

fun main() {
    Chinese.report()
}
