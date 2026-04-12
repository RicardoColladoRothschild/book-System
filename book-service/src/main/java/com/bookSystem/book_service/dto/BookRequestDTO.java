package com.bookSystem.book_service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record BookRequestDTO(

        @NotBlank
        String name,
        @NotNull
        LocalDate publishedDate,
        @NotNull
        long authorId
) {
}
