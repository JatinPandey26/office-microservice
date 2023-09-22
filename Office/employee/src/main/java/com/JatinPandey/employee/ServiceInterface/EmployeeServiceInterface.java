package com.JatinPandey.employee.ServiceInterface;

import com.JatinPandey.employee.Payloads.EmployeeDTO;

public interface EmployeeServiceInterface {
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO getEmployee(Long empID);


}
