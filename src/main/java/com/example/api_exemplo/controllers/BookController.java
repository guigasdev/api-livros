package com.example.api_exemplo.controllers;

import com.example.api_exemplo.domain.Book;
import com.example.api_exemplo.services.BookService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")

public class BookController {
    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }


    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = this.service.getBooksFromLibrary();
        System.out.println(books);
        return ResponseEntity.ok().body(books);
    }
}
