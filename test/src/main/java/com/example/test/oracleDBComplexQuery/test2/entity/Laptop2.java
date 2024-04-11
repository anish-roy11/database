package com.example.test.oracleDBComplexQuery.test2.entity;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_LAPTOP2")
public class Laptop2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "laptop2Id")
    private int laptop2Id;

    @Column(name = "modelNumber")
    private String modelNumber;

    @Column(name = "brand")
    private String brand;



    /*
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "laptop2")
    private Student student2;

     */
}
