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
@Table(name = "jpa_books")
public class Book {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "int")
    private int id;

    //@NotNull(message = "Book name cannot be null")
    @Column(name = "book_name", columnDefinition = "VARCHAR(255)")
    private String bookName;

    @Column(name = "author", columnDefinition = "VARCHAR(255)")
    private String author;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book1")
    Booking booking1;


    public Book(int id, String bookname1, String author1) {
        this.id =id;
        this.bookName = bookname1;
        this.author=author1;

    }
}
