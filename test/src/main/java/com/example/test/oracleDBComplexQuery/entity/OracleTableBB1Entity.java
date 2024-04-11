package com.example.test.oracleDBComplexQuery.entity;


import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.repository.OracleTableAA1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableBB1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableCC1Repository;
import com.example.test.oracleDBComplexQuery.controller.OracleDBController;

import javax.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.sql.Time;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="TABLE_BB1")
public class OracleTableBB1Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAB_B_ID")
    private String tabB_id;

    @Column(name = "CARID")
    private String carId;

    @Column(name = "FACILITY_ID")
    private String facilityId;

    @Column(name = "FACILITY_REF_NUMBER")
    private String facilityRefNumber;
}
