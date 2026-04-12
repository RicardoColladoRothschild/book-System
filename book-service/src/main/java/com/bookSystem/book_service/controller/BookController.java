package com.bookSystem.book_service.controller;

import com.bookSystem.book_service.dto.BookRequestDTO;
import com.bookSystem.book_service.dto.BookResponseDTO;
import com.bookSystem.book_service.entity.Book;
import com.bookSystem.book_service.service.BookService;
import jakarta.validation.Valid;
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
        public ResponseEntity<List<BookResponseDTO>> getAllBooks(){

                return ResponseEntity.ok().body(bookService.getAllBook());
        }


        @PostMapping
        public ResponseEntity<BookResponseDTO> createdBook(@Valid @RequestBody BookRequestDTO dto){
            BookResponseDTO response = bookService.createBook(dto);
            return ResponseEntity.ok(response);
        }

        @GetMapping("/{id}")
        public ResponseEntity<BookResponseDTO> getBookById(@PathVariable Long id){
            return ResponseEntity.ok(bookService.getBookById(id));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteBook(@PathVariable Long id){
             bookService.deleteBook(id);
             return ResponseEntity.noContent().build();
        }



}
