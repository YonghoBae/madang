package com.example.DBTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "vw_Orders") // 테이블 이름과 동일하게 매핑
@Getter
@Setter
@NoArgsConstructor
public class VwOrdersEntity {
    @Id
    @Column(name = "orderid") // 기본 키 매핑
    private Integer orderId;

    @Column(name = "custid")
    private Integer custId;

    @Column(name = "name", length = 40)
    private String name;

    @Column(name = "bookid")
    private Integer bookId;

    @Column(name = "bookname", length = 40)
    private String bookName;

    @Column(name = "saleprice")
    private Integer salePrice;

    @Column(name = "orderdate")
    private Date orderDate;
}
