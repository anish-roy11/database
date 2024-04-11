package com.example.test.oracleDBComplexQuery.test2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private int addressId;

    @Column(name = "addrLine1")
    private String addrLine1;

    @Column(name = "addrLine2")
    private String addrLine2;

    @Column(name = "addrLine3")
    private String addrLine3;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PartyPerson_Address_Id")
    private PartyPerson partyPersonObj;


}