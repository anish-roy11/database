package com.example.test.oracleDBComplexQuery.test2.repository;


import com.example.test.oracleDBComplexQuery.test2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
