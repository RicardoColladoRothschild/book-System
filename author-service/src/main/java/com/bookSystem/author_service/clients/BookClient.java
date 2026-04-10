package com.bookSystem.author_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="book-client", url = "${application.services.book-service.url}")
public interface BookClient {

    @GetMapping("/books/all")
    List<BookDTO> getAllBooks();
}
