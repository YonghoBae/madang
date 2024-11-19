package com.example.DBTest.service;

import com.example.DBTest.dto.BookDTO;
import com.example.DBTest.entity.BookEntity;
import com.example.DBTest.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookDTO> findAllBooks() {
        List<BookEntity> entities = bookRepository.findAll();
        return entities.stream().map(entity -> {
            BookDTO dto = new BookDTO();
            dto.setBookId(entity.getBookId());
            dto.setBookName(entity.getBookName());
            dto.setPublisher(entity.getPublisher());
            dto.setPrice(entity.getPrice());
            return dto;
        }).collect(Collectors.toList());
    }

    public BookDTO findBookById(Long id) {
        BookEntity entity = bookRepository.findById(id).orElseThrow();
        BookDTO dto = new BookDTO();
        dto.setBookId(entity.getBookId());
        dto.setBookName(entity.getBookName());
        dto.setPublisher(entity.getPublisher());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public void saveBook(BookDTO bookDTO) {
        bookRepository.save(BookEntity.toEntity(bookDTO));
    }

    public void updateBook(BookDTO bookDTO) {
        BookEntity entity = bookRepository.findById(bookDTO.getBookId()).orElseThrow();
        entity.setBookName(bookDTO.getBookName());
        entity.setPublisher(bookDTO.getPublisher());
        entity.setPrice(bookDTO.getPrice());
        bookRepository.save(entity);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
