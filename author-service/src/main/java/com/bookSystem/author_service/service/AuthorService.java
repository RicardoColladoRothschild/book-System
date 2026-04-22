package com.bookSystem.author_service.service;


import com.bookSystem.author_service.dto.AuthorResponseDTO;
import com.bookSystem.author_service.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import utility.AuthorMapper;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorReposiroty;

        public AuthorService(AuthorRepository repository){
            this.authorReposiroty = repository;
        }


        public List<AuthorResponseDTO> getAll(){
            return authorReposiroty.findAll()
                    .stream()
                    .map(AuthorMapper::toDto)
                    .toList();
        }
}
