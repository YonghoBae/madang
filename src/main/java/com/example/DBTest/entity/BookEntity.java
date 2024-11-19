package com.example.DBTest.entity;

import com.example.DBTest.dto.BookDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Book")
@Getter
@Setter
@NoArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(nullable = false, length = 40)
    private String bookName;

    @Column(length = 40)
    private String publisher;

    @Column
    private Integer price;

    public static BookEntity toEntity(BookDTO dto) {
        BookEntity entity = new BookEntity();
        entity.setBookId(dto.getBookId());
        entity.setBookName(dto.getBookName());
        entity.setPublisher(dto.getPublisher());
        entity.setPrice(dto.getPrice());
        return entity;
    }
}