package com.example.DBTest.controller;

import com.example.DBTest.dto.BookDTO;
import com.example.DBTest.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/{id}")
    public BookDTO getBook(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody BookDTO bookDTO) {
        bookService.saveBook(bookDTO);
        return ResponseEntity.ok("Book created successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateBook(@RequestBody BookDTO bookDTO) {
        bookService.updateBook(bookDTO);
        return ResponseEntity.ok("Book updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully");
    }
}
