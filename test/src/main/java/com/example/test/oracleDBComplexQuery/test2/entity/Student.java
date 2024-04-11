package com.example.test.oracleDBComplexQuery.test2.entity;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentId")
    private int studentId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "about")
    private String about;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_2_laptop_id")
    private Laptop laptop2;
}
