package me.tingcobell.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class BookController {

    @GetMapping("/foo")
    public String getFoo() {
        return "tingcobell";
    }

    @GetMapping("/flux")
    public Flux<String> getFlux() {
        return Flux.just("a", "b", "c");
    }

    @GetMapping("/mono")
    public Mono<String> getMono() {
        return Mono.just("mono");
    }
}
