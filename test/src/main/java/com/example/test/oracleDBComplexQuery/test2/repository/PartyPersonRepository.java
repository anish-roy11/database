package com.example.test.oracleDBComplexQuery.test2.repository;


import com.example.test.oracleDBComplexQuery.test2.entity.PartyPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyPersonRepository extends JpaRepository<PartyPerson,Long> {
}
