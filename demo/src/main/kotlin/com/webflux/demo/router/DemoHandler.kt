package com.webflux.demo.router

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class DemoHandler {

    fun demo(request: ServerRequest): Mono<ServerResponse> = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just("route demo"))
}