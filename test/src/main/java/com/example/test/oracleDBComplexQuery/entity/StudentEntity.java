package com.example.test.oracleDBComplexQuery.entity;


import javax.persistence.*;
import lombok.*;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

@Entity
@Table(name="TABLE_STUDENT1")
public class StudentEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TABLE_ID")
    private long tableid;

    @Column(name = "ROLL_NO")
    private int rollno;

    @Column(name = "FIRST_NAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Column(name = "GENDER")
    private String gender;

    public long getTableid() {
        return tableid;
    }

    public void setTableid(long tableid) {
        this.tableid = tableid;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "rollno=" + rollno +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
