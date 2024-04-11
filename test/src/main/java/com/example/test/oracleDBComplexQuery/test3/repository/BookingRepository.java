package com.example.test.oracleDBComplexQuery.test3.repository;

import com.example.test.oracleDBComplexQuery.test3.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // some booking repository methods

    @Query(value = "SELECT * FROM jpa_bookings " +
            "WHERE customer_id in (SELECT id FROM jpa_customer WHERE phone = :phone) " +
            " AND book_id in (SELECT id FROM jpa_books WHERE author IN :authors)",
            nativeQuery = true)
    List<Booking> queryBy(@Param("phone") String phone,
                          @Param("authors") List<String> authors);


}
