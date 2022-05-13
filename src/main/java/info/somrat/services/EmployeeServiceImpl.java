package info.somrat.services;

import info.somrat.entities.Employee;

import info.somrat.repositories.EmployeeRepository;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeesRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public Stream<Employee> getAllEmployees() {
        return StreamSupport.stream(employeesRepository.findAll().spliterator(), true);
    }
}
