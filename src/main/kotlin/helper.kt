/*
Helper functions for main file
 */
package src.main.kotlin.helper

import okhttp3.OkHttpClient
import okhttp3.Request

val client = OkHttpClient();

fun makeRequest(
    city: String,
    date: String,
    apiKey: String,
    apiHost: String
): Map<String, Any?> {
    val queryString = "q=$city&dt=$date"
    val request = Request.Builder()
        .url("https://weatherapi-com.p.rapidapi.com/future.json?$queryString")
        .addHeader("X-RapidAPI-Key", apiKey)
        .addHeader("X-RapidAPI-Host", apiHost)
        .build()

    println(request)
    // TODO(mark): update response
    val response = ""
    println(response)

    return mapOf(city to "Foo", date to 1)
}