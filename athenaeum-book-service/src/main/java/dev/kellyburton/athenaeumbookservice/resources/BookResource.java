package dev.kellyburton.athenaeumbookservice.resources;

import dev.kellyburton.athenaeumbookservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookResource {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{id}")
    public Mono<Book> getBookInfo(@PathVariable("id") String id ){
        Mono<Book> book = webClientBuilder.build()
                .get()
                .uri("https://www.googleapis.com/books/v1/volumes/"+id)
                .retrieve()
                .bodyToMono(Book.class);
        return book;
    }

    /*
    @RequestMapping("/{id}")
    public Book getBookInfo(@PathVariable("id") String id){
        Book book = restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes/" + id, Book.class);
        return book;
    }
     */
}
