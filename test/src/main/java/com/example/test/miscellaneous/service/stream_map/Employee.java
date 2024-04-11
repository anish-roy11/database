package com.example.test.miscellaneous.service.stream_map;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {

    String firstName;
    String lastName;
    String middleName;
    String empId;
    String department;
    int age;
    int salary;
    List<Address> addressList;


}
