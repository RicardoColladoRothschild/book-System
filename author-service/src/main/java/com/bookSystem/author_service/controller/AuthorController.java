package com.bookSystem.author_service.controller;


import com.bookSystem.author_service.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService service;

        public AuthorController(AuthorService service){
            this.service = service;
        }
}
