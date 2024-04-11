package com.example.test.oracleDBComplexQuery.test2.repository;

import com.example.test.oracleDBComplexQuery.test2.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
