package com.bookSystem.author_service.entity;


import jakarta.persistence.*;


import java.util.Date;
import java.util.Objects;

@Entity
public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private Date publishedDate;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author);
    }

    @ManyToOne
        @JoinColumn(name = "author_id")
        private Author author;

}
