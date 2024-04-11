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
//@Table(name="DEPARTMENT")

public class OracleDepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Dnumber")
    private String dnumber;

    @Column(name = "Dname")
    private String dname;

    @Column(name = "Mgr_ssn")
    private String mgr_ssn;

    @Column(name = "Mgr_start_date")
    private String mgr_start_date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_time")
    private java.sql.Timestamp creation_time;


}
