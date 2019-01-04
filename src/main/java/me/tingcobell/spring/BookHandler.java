package me.tingcobell.spring;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class BookHandler {

    public Mono<ServerResponse> allBooks(ServerRequest request) {
        Book book1 = new Book();
        book1.setTitle("Mono1");
        book1.setIsbn("1234");

        Book book2 = new Book();
        book2.setTitle("Mono2");
        book2.setIsbn("1234");

        Flux<Book> books = Flux.just(book1, book2);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(books, Book.class);
    }

    public Mono<ServerResponse> findByOne(ServerRequest request) {
        Book book1 = new Book();
        book1.setTitle("Mono3");
        book1.setIsbn("1234");

        Book book2 = new Book();
        book2.setTitle("Mono4");
        book2.setIsbn("1234");

        Flux<Book> books = Flux.just(book1, book2);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(books, Book.class);
    }

}
