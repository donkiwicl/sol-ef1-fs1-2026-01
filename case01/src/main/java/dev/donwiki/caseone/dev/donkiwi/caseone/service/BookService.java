package dev.donwiki.caseone.dev.donkiwi.caseone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.donwiki.caseone.dev.donkiwi.caseone.model.Book;
import dev.donwiki.caseone.dev.donkiwi.caseone.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book){
        return bookRepository.createBook(book);
    }

    public List<Book> listBooks(){
        return bookRepository.findAll();
    }

    public void deleteBookByName(String name){
        Book book = bookRepository.findBookByName(name);
        bookRepository.deleteBook(book);
    }
}
