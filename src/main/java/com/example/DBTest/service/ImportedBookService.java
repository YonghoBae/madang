package com.example.DBTest.service;

import com.example.DBTest.entity.ImportedBookEntity;
import com.example.DBTest.repository.ImportedBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImportedBookService {
    private final ImportedBookRepository importedBookRepository;

    public List<ImportedBookEntity> findAllBooks() {
        return importedBookRepository.findAll();
    }

    public ImportedBookEntity findBookById(Integer id) {
        return importedBookRepository.findById(id).orElseThrow();
    }

    public void saveBook(ImportedBookEntity book) {
        importedBookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        importedBookRepository.deleteById(id);
    }
}
