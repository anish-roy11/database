package com.example.test.oracleDBComplexQuery.test2.repository;

import com.example.test.oracleDBComplexQuery.test2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
