/**
 * @author Fariha Nawaz
 * @since 2/18/2021
 */
package com.prithila.springrestapi.service;

import com.prithila.springrestapi.model.Employees;
import com.prithila.springrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employees create(Employees employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional get(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employees update(Employees employees, Long Id) {
        return employeeRepository.save(employees);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public List<Employees> list() {
        return employeeRepository.findAll();
    }
}
