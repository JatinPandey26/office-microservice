package com.JatinPandey.employee.Mapper;


import com.JatinPandey.employee.Entity.Employee;
import com.JatinPandey.employee.Payloads.EmployeeDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")

public interface EmployeeMapper {
    EmployeeDTO toDto(Employee employee);

    Employee toEntity(EmployeeDTO employeeDTO);
}
