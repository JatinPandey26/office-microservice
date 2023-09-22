package com.JatinPandey.employee.Payloads;
import lombok.Data;

@Data
public class EmployeeDTO {
    private long id;
    private String name;
    private int age;
    private AddressDTO addressDTO;
}
