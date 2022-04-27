package com.example.hellokmm

class Greeting {
    fun greeting(): String {
        return """
            Hello, ${Platform().platform}!
            Welcome to Kotlin Multiplatform!
            """.trimIndent()
    }
}