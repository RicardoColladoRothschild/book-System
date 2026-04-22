package com.bookSystem.author_service.controller;


import com.bookSystem.author_service.dto.AuthorResponseDTO;
import com.bookSystem.author_service.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService service;

        public AuthorController(AuthorService service){
            this.service = service;
        }

        @GetMapping
        public ResponseEntity<List<AuthorResponseDTO>> getAllAuthor(){
            return ResponseEntity.ok().body(service.getAll());
        }
}
