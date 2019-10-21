package com.example.employeetracker;

import com.example.employeetracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeetrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeetrackerApplication.class, args);
    }

}
