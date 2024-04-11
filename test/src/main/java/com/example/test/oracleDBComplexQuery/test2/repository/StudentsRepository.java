package com.example.test.oracleDBComplexQuery.test2.repository;


import com.example.test.oracleDBComplexQuery.test2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student,Long> {
}
