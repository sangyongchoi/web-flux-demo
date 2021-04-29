package com.webflux.demo.account

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.accept
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class AccountRouter(
    private val accountHandler: AccountHandler
) {

    @Bean
    fun getAccountRoute(): RouterFunction<ServerResponse> {
        return route(GET("/accounts/{id}").and(accept(MediaType.APPLICATION_JSON)), accountHandler::get)
    }
}