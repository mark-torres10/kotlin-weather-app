package src.main.kotlin.main

import io.github.cdimascio.dotenv.dotenv

import src.main.kotlin.helper.makeRequest

fun main() {
    // get user input

    // make request
    var city = "Chicago"
    var date = "2022-08-28"
    val dotenv = dotenv()
    val apiKey = dotenv["X-RapidAPI-Key"]
    val apiHost = dotenv["X-RapidAPI-Host"]

    var requestOutput = makeRequest(
        city=city, date=date, apiKey=apiKey, apiHost=apiHost
    )
    println(requestOutput)

    // return string-formatted output
}