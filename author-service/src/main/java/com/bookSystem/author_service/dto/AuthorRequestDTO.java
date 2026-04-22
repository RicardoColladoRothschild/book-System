package com.bookSystem.author_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record AuthorRequestDTO(
    @NotBlank
    String name,
    List<Long> bookIds
) {
}
