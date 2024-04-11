package com.example.test.database.repository;

import com.example.test.database.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    //here in JpaRepository<EmployeeEntity,Long>, Long denotes the data type of primary key in  EmployeeEntity related table
    // or
//public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {

    //List<EmployeeEntity> getAllEmployeeEntityList();
    //ResponseEntity<EmployeeEntity[]> getAllEmployeeEntityList();
    List<EmployeeEntity> findAll();
}
