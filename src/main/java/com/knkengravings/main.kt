package com.knkengravings

import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.meta
import kotlinx.html.stream.appendHTML
import kotlinx.html.title
import java.io.File

fun main(args: Array<String>) {
    val outputFile = File("index.html")

    val text = buildString {
        appendln("<!DOCTYPE html>")
        appendHTML().html {
            head {
                meta { charset = "UTF-8" }
                title("KnK Engravings")
            }
            body {
                h1 { + "This is from kotlin." }
            }
        }
        appendln()
    }

    outputFile.writeText(text)
}