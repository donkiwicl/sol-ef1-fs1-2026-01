package dev.donwiki.caseone.dev.donkiwi.caseone.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.donwiki.caseone.dev.donkiwi.caseone.model.Book;

@Repository
public class BookRepository {
    private final List<Book> bookList = new ArrayList<>();

    public Book createBook(Book book){
        bookList.add(book);
        return book;
    }

    public List<Book> findAll(){
        return bookList;
    }

    public Book findBookById(int id){
        for(Book book: bookList){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public Book findBookByName(String name){
        for(Book book: bookList){
            if(book.getName().equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }

    public Book updateBook(Book book){
        Book updateBook = findBookById(book.getId());
        if(updateBook != null){
            bookList.remove(updateBook);
            bookList.add(book);
            updateBook = book;
        }
        return updateBook;   
    }

    public void deleteBook(Book book){
        Book deleteBook = findBookById(book.getId());
        if(deleteBook != null){
            bookList.remove(deleteBook);
        }
    }
}
