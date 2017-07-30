package com.firstapp.SpringWebApp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringWebAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringWebAppApplication::class.java, *args)
}
