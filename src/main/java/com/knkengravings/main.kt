package com.knkengravings

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.img
import kotlinx.html.link
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
                meta(charset = "UTF-8")
                title(content = "KnK Engravings")
                link(rel = "stylesheet", href = "https://fonts.googleapis.com/css?family=Poppins:300,500,600")
                link(rel = "stylesheet", href = "css/linearicons.css")
                link(rel = "stylesheet", href = "css/font-awesome.min.css")
                link(rel = "stylesheet", href = "css/nice-select.css")
                link(rel = "stylesheet", href = "css/magnific-popup.css")
                link(rel = "stylesheet", href = "css/bootstrap.css")
                link(rel = "stylesheet", href = "css/main.css")
            }
            body {
                div("main-wrapper-first")
                div("main-wrapper") {
                    div("banner-area") {
                        div("container") {
                            div("row height justify-content-center align-items-center") {
                                div("col-lg-5 col-sm-6 col-xs-6") {
                                    img(src = "img/knk.png") {
                                        width = "100%"
                                    }
                                }
                            }
                        }
                    }
                }
                div("main-wrapper") {
                    div("featured-area") {
                        div("container") {
                            fun icon(name: String) = img(
                                    src = "img/$name.png"
                            ) {
                                height = "100px"
                                width = "100px"
                            }

                            val colClasses = "col-md-4 col-sm-12 text-center"
                            div("row") {
                                div(colClasses) {
                                    icon("etsy")
//                                    + "Etsy"
                                }
                                div(colClasses) {
                                    icon("insta")
//                                    + "Instagram"
                                }
                                div(colClasses) {
                                    icon("fb")
//                                    + "Facebook"
                                }
                            }
                        }
                    }
                }
            }
        }
        appendln()
    }

    outputFile.writeText(text)
}