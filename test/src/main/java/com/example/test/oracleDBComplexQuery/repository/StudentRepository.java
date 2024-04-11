package com.example.test.oracleDBComplexQuery.repository;


import com.example.test.oracleDBComplexQuery.entity.OracleTableAA1Entity;
import com.example.test.oracleDBComplexQuery.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    //List<StudentEntity> findAll();



    StudentEntity save(StudentEntity studentEntity);

}
