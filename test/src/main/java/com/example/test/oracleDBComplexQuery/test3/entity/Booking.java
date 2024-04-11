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
@Table(name = "jpa_bookings")
public class Booking {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "int")
    private int id;

    //@NotNull(message = "Book id cannot be null")
    @Column(name = "book_id", columnDefinition = "int")
    private int bookId;

    //@NotNull(message = "Customer id cannot be null")
    @Column(name = "customer_id", columnDefinition = "int")
    private int customerId;

//    @Column(name = "issue_date", columnDefinition = "DATETIME")
//    private String issueDate;
//
//    @Column(name = "return_date", columnDefinition = "DATETIME")
//    private String returnDate;


    //@JoinColumn(name = "book_id2", insertable = false, updatable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id2")
    private Book book1;

    //@JoinColumn(name = "customer_id2", insertable = false, updatable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id2")
    private Customer customer1;

    public Booking(int id, int bookId, int customerId) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
    }
}
