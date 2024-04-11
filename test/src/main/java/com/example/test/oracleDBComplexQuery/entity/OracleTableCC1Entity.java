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
@Table(name="TABLE_CC1")

public class OracleTableCC1Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAB_C_ID")
    private String tabC_id;

    @Column(name = "FACILITY_ID")
    private String facilityId;

    @Column(name = "FACILITY_TYPE")
    private String facilitytype;
}
