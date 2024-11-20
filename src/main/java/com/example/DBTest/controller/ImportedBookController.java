package com.example.DBTest.controller;

import com.example.DBTest.entity.ImportedBookEntity;
import com.example.DBTest.service.ImportedBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imported-books")
@RequiredArgsConstructor
public class ImportedBookController {
    private final ImportedBookService importedBookService;

    @GetMapping
    public List<ImportedBookEntity> getAllBooks() {
        return importedBookService.findAllBooks();
    }

    @GetMapping("/{id}")
    public ImportedBookEntity getBook(@PathVariable Integer id) {
        return importedBookService.findBookById(id);
    }

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody ImportedBookEntity book) {
        importedBookService.saveBook(book);
        return ResponseEntity.ok("Imported Book created successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
        importedBookService.deleteBook(id);
        return ResponseEntity.ok("Imported Book deleted successfully");
    }
}
