package org.example

import io.vertx.core.Vertx
import io.vertx.kotlin.core.http.endAwait

suspend fun main() {
    val vertx = Vertx.vertx()
    val httpClient = vertx.createHttpClient()
    println("before")
    httpClient.getAbs("https://reqres.in/api/user/1").handler {}.endAwait()
    println("after")
}