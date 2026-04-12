package com.bookSystem.book_service.dto;

import java.time.LocalDate;

public record BookResponseDTO(
        Long id,
        String name,
        LocalDate publishedDate
) {
}
