package com.example.test.oracleDBComplexQuery.test3.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
//@Table(name = "jpa_customer", uniqueConstraints = {@UniqueConstraint(columnNames = {"phone"})})
@Table(name = "jpa_customer")
public class Customer {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "int")
    private int id;

    //@NotNull(message = "Customer name cannot be null")
    @Column(name = "name", columnDefinition = "VARCHAR(255)")
    private String name;

    @Column(name = "phone", columnDefinition = "VARCHAR(15)")
    private String phone;

    //@Column(name = "registered", columnDefinition = "DATETIME")
    //private String registered;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer1")
    Booking booking2;

    public Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}