package com.example.test.oracleDBComplexQuery.repository;

//import com.example.test.database.entity.EmployeeEntity;
import com.example.test.oracleDBComplexQuery.entity.OracleTableAA1Entity;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.entity.OracleEmployeeEntity;
import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OracleTableAA1Repository extends JpaRepository<OracleTableAA1Entity,Long>{

    List<OracleTableAA1Entity> findAll();
}