package com.example.DBTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Imported_Book")
@Getter
@Setter
@NoArgsConstructor
public class ImportedBookEntity {
    @Id
    @Column(name = "bookid")
    private Integer bookId;

    @Column(name = "bookname", nullable = false, length = 40)
    private String bookName;

    @Column(name = "publisher", length = 40)
    private String publisher;

    @Column(name = "price")
    private Integer price;
}
