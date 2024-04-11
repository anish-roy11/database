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
@Table(name = "JPA_Product2")
public class Product2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product2Id")
    private int product2Id;


    @Column(name = "produc2tName")
    private String product2Name;

    @Column(name = "product2Description")
    private String product2Description;


    @Column(name = "product2Type")
    private String product2Type;



    //@ManyToMany(cascade = CascadeType.ALL, mappedBy = "product2ObjList1")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product2_category2",
            joinColumns = {@JoinColumn(name = "product2_id")},
            inverseJoinColumns = {@JoinColumn(name = "category2_id")}
    )
    private List<Category2> ctgry2ObjList1;


}