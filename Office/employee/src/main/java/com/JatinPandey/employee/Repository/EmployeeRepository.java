package com.JatinPandey.employee.Repository;

import com.JatinPandey.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
