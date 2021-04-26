package com.webflux.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class DemoController {

    @GetMapping("/demo/mono")
    fun monoDemo(): Mono<String> = Mono.just("demo")

    @GetMapping("/demo/flux")
    fun fluxDemo(): Flux<String> = Flux.just("demo1", "demo2", "demo3")
}