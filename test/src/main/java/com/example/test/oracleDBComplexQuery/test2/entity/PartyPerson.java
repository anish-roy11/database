package com.example.test.oracleDBComplexQuery.test2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "JPA_PartyPerson")
public class PartyPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "partyPersonId")
    private int partyPersonId;

    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    @Column(name = "sex")
    private String sex;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyPersonObj")
    private List<Address> addressList1 ;


}