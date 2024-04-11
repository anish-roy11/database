package com.example.test.oracleDBComplexQuery.test2.repository;

import com.example.test.oracleDBComplexQuery.test2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
