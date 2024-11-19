package com.example.DBTest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BookDTO {
    private Long bookId;
    private String bookName;
    private String publisher;
    private Integer price;
}