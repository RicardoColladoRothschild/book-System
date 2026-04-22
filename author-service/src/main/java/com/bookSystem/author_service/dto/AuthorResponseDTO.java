package com.bookSystem.author_service.dto;

import java.util.List;

public record AuthorResponseDTO(
        Long id,
        String name,
        List<Long> booksId
) {
}
