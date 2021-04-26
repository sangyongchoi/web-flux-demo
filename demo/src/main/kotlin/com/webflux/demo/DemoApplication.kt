package com.webflux.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
