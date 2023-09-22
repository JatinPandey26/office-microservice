package com.JatinPandey.employee.Payloads;

import lombok.Data;

@Data
public class AddressDTO {
    private long id;
    private String city;
    private String country;
    private long pincode;
}
