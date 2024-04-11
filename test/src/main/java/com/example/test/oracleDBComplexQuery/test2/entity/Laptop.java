package com.example.test.oracleDBComplexQuery.test2.entity;


import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_LAPTOP")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "laptopId")
    private int laptopId;

    @Column(name = "modelNumber")
    private String modelNumber;

    @Column(name = "brand")
    private String brand;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "laptop2")
    private Student student2;
}
