package com.JatinPandey.address.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private long pincode;

}
