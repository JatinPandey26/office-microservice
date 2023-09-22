package com.JatinPandey.employee.Controller;

import com.JatinPandey.employee.Payloads.EmployeeDTO;
import com.JatinPandey.employee.ServiceImpl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO savedEmployeeDTO = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(savedEmployeeDTO, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public  ResponseEntity<EmployeeDTO> getEmployee(@RequestParam Long empId){
        EmployeeDTO employeeDTO = employeeService.getEmployee(empId);
        return new ResponseEntity<>(employeeDTO,HttpStatus.FOUND);
    }
}
