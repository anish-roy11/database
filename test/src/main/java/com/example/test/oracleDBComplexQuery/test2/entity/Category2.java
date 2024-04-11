package com.example.test.oracleDBComplexQuery.test2.entity;

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
@Table(name = "JPA_Category2")
public class Category2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category2Id")
    private int category2Id;


    @Column(name = "category2Name")
    private String category2Name;

    @Column(name = "category2Description")
    private String category2Description;

    @ManyToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "category2Obj_product2Object_id")
    private List<Product2> prd2ObjList1;


}