package me.tingcobell.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HandlerConfiguration {

    @Bean
    RouterFunction<ServerResponse> monoRouterFunction(BookHandler bookHandler) {
        return route(GET("/book1").and(accept(MediaType.APPLICATION_JSON)), bookHandler::allBooks)
            .andRoute(GET("/book2").and(accept(MediaType.APPLICATION_JSON)), bookHandler::findByOne);
    }
}
