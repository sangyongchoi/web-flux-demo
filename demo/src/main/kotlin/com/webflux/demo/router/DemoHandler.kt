package com.webflux.demo.router

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class DemoHandler {

    val client = WebClient
        .create("http://localhost:8090")

    fun demo(request: ServerRequest): Mono<ServerResponse> {
        val result = client.get()
            .uri("/accounts/1").accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToFlux(String::class.java)

        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(result)
    }
}