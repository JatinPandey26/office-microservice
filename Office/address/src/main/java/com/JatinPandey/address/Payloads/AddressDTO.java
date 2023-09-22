package com.JatinPandey.address.Payloads;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddressDTO {
    private long id;
    private String city;
    private String country;
    private long pincode;
}
