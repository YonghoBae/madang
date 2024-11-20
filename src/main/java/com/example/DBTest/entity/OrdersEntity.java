package com.example.DBTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Orders")
@Getter
@Setter
@NoArgsConstructor
public class OrdersEntity {
    @Id
    @Column(name = "orderid")
    private Integer orderId;

    @Column(name = "custid")
    private Integer custId;

    @Column(name = "bookid")
    private Integer bookId;

    @Column(name = "saleprice")
    private Integer salePrice;

    @Column(name = "orderdate")
    private Date orderDate;

    @Column(name = "bname", length = 100)
    private String bookName;
}
