package com.bookSystem.book_service.utility;

import com.bookSystem.book_service.dto.BookRequestDTO;
import com.bookSystem.book_service.dto.BookResponseDTO;
import com.bookSystem.book_service.entity.Book;

public class BookMapper {


    public static Book toEntity(BookRequestDTO dto){
        Book book = new Book();
        book.setName(dto.name());
        //TODO: Before adding authorId to entity, make sure that authorId does exist
        book.setAuthorId(dto.authorId());
        book.setPublishedDate(dto.publishedDate());

        return book;
    }


    public static BookResponseDTO toDto(Book book){
        return new BookResponseDTO(
                book.getId(),
                book.getName(),
                book.getPublishedDate()
        );
    }
}
