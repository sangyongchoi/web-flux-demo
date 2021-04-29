package com.webflux.demo.account

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class AccountHandler {

    fun get(request: ServerRequest): Mono<ServerResponse> {
        println("들어왔습니다 " + request.pathVariable("id"))
        return ok()
            .body(Flux.just("1","2","3"))
    }
}