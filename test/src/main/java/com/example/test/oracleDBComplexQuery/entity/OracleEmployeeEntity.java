package com.example.test.oracleDBComplexQuery.entity;

import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.repository.OracleTableAA1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableBB1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableCC1Repository;
import com.example.test.oracleDBComplexQuery.controller.OracleDBController;

import javax.persistence.*;
import lombok.*;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//@Entity
//@Table(name="EMPLOYEE")

/*@NamedNativeQueries({

        @NamedNativeQuery(name="query1",query="select * from tableA a, tableB b where b.buId=:businessUnitId"),
        @NamedNativeQuery(name="query2",query="select * from tableA a, tableC c where c.buId=:businessUnitId")
})

 */
public class OracleEmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ssn")
    private String ssn;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Minit")
    private String minit;

    @Column(name = "Lname")
    private String lname;

    @Temporal(TemporalType.DATE)
    @Column(name = "Bdate")
    private java.util.Date bdate;

    @Column(name = "Address")
    private String address;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Salary")
    private float salary;

    @Column(name = "Super_ssn")
    private String super_ssn;

    @Column(name = "Dno")
    private int dno;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_time")
    private java.sql.Timestamp creation_time;

}
