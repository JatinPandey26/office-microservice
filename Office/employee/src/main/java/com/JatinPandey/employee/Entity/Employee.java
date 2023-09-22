package com.JatinPandey.employee.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private int age;

}
