package com.example.DBTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "custid")
    private Integer custId;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "phone", length = 20)
    private String phone;
}
