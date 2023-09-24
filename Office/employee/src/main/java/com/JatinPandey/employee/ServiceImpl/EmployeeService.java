package com.JatinPandey.employee.ServiceImpl;

import com.JatinPandey.employee.Entity.Employee;
import com.JatinPandey.employee.Exceptions.ResourceNotFoundException;
import com.JatinPandey.employee.FeignClients.AddressClient;
import com.JatinPandey.employee.Mapper.EmployeeMapper;
import com.JatinPandey.employee.Payloads.AddressDTO;
import com.JatinPandey.employee.Payloads.EmployeeDTO;
import com.JatinPandey.employee.Repository.EmployeeRepository;
import com.JatinPandey.employee.ServiceInterface.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    AddressClient addressClient;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);

        return employeeMapper.toDto(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployee(Long empID) {
        Employee employee = employeeRepository.findById(empID).orElseThrow(() -> new ResourceNotFoundException("Employee","id",empID));
        EmployeeDTO employeeDTO = employeeMapper.toDto(employee);
        AddressDTO addressDTO = addressClient.getAddressByEmployeeId(empID);
        employeeDTO.setAddressDTO(addressDTO);
        return employeeDTO;
    }
}
