/*
Helper functions for main file
 */
package src.main.kotlin.helper

import java.io.IOException
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

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
        .get()
        .addHeader("X-RapidAPI-Key", apiKey)
        .addHeader("X-RapidAPI-Host", apiHost)
        .build()

    println(request)
    println("Making request...")
    val response = client.newCall(request).execute()
    println(response)

    return mapOf(city to "Foo", date to 1)
}