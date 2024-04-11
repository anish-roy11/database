package com.example.test.oracleDBComplexQuery.test2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private int productId;


    @Column(name = "productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;


    @Column(name = "productType")
    private String productType;



    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "productObjList1")
    private List<Category> categoryObjList1;


}