package com.bookSystem.book_service.dto;

import java.time.LocalDate;

public record BookRequestDTO(
        String name,
        LocalDate publishedDate,
        long AuthorId
) {
}
