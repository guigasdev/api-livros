package com.example.api_exemplo.feign;

import com.example.api_exemplo.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://bookexample-api.s3.us-east-2.amazonaws.com")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooks();
}
