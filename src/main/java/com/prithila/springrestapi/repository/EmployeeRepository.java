/**
 * @author Fariha Nawaz
 * @since 2/18/2021
 */
package com.prithila.springrestapi.repository;

import com.prithila.springrestapi.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    /*
    overriding the findAll() method to return the values as list
     */
    @Override
    List<Employees> findAll();
}
