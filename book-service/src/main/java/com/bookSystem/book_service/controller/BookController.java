package com.bookSystem.book_service.controller;

import com.bookSystem.book_service.entity.Book;
import com.bookSystem.book_service.service.BookService;
import feign.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

        public BookController(BookService bookservice){
            this.bookService = bookservice;
        }


        @GetMapping
        public ResponseEntity<List<Book>> getAllBooks(){

                return ResponseEntity.ok().body(bookService.getAllBook());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Book> getBookById(@PathVariable Long id){
            return ResponseEntity.ok(bookService.getBookById(id));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Book> deleteBook(@PathVariable Long id){
            return ResponseEntity.ok(bookService.deleteBook(id));
        }



}
