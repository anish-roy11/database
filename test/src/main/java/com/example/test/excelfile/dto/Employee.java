package com.example.test.excelfile.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Employee {

    public int employeeid;
    public String firstName;
    public String middleName;
    public String lastName;
    public String department;
    public Date dateOfBirth;
    public Timestamp creationTime;
}
