package com.example.test.miscellaneous.service.stream_map;

import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    String companyName;
    List<Employee> employeeList;

}
