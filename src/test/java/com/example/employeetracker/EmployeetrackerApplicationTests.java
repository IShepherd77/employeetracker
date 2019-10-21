package com.example.employeetracker;

import com.example.employeetracker.models.Employee;
import com.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
        employeeRepository.save(new Employee("Ian Shepherd", 21, 101, "ianshepherd@gmail.com"));
        employeeRepository.save(new Employee("Graham Sawers", 12, 102, "grahamsawers@gmail.com"));
    }

}
