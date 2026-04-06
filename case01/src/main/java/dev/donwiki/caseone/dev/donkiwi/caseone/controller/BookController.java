package dev.donwiki.caseone.dev.donkiwi.caseone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.donwiki.caseone.dev.donkiwi.caseone.model.Book;
import dev.donwiki.caseone.dev.donkiwi.caseone.service.BookService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.listBooks();

        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> createNewBook(Book book){
        book = bookService.createBook(book);
        if(book == null){
            return ResponseEntity.badRequest().build();
        }else{
            return ResponseEntity.ok(book);
        }
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<String> deleteBookByName(@Valid String name){
        bookService.deleteBookByName(name);

        return ResponseEntity.noContent().build();
    }
}
