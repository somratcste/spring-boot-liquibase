package info.somrat.services;

import info.somrat.entities.Employee;

import java.util.stream.Stream;

public interface EmployeeService {
    Stream<Employee> getAllEmployees();
}
