package dev.donwiki.caseone.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.donwiki.caseone.model.Book;

@Repository
public class BookRepository {
    private final List<Book> bookList = new ArrayList<>();

    public Book createBook(Book book){
        bookList.add(book);
        return book;
    }

    public Book findBookById(int id){
        for(Book book: bookList){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public Book updateBook(Book book){
        return book;   
    }
}
