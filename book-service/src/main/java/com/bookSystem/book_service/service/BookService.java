package com.bookSystem.book_service.service;

import com.bookSystem.book_service.entity.Book;
import com.bookSystem.book_service.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class BookService {

    private final BookRepository repository;

        public BookService(BookRepository repository){
            this.repository = repository;
        }


        public List<Book> getAllBook(){
                return this.repository.findAll();
        }

        public Book deleteBook(Long id){
            Book bookToDelete = this.repository.findById(id)
                    .orElseThrow(()-> new RuntimeException("Book not found with id: " + id));

                repository.delete(bookToDelete);
                return bookToDelete;

        }

        public Book getBookById(Long id){
            Book book = repository.findById(id)
                    .orElseThrow(()-> new RuntimeException("Book not found with id: " + id));

            return book;

        }


        //TO-DO Pending create a method to obtain books per author, to do this, we need to complete the author-service rep and controller.
}
