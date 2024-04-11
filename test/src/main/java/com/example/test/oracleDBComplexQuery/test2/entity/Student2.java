package com.example.test.oracleDBComplexQuery.test2.entity;


import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_STUDENT2")
public class Student2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student2Id")
    private int student2Id;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "about")
    private String about;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student2_laptop2",
            joinColumns = {@JoinColumn(name = "student2_id")},
            inverseJoinColumns = {@JoinColumn(name = "laptop2_id")}
    )
    //@JoinColumn(name = "laptop_2_laptop_id")
    private Laptop2 laptop2;

}