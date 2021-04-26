package com.webflux.demo.router

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.accept
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class DemoRouter {

    @Bean
    fun demoRouterInfo(handler: DemoHandler): RouterFunction<ServerResponse> {
        return RouterFunctions.route(GET("/demo/route").and(accept(MediaType.APPLICATION_JSON)), handler::demo)
    }
}