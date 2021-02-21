/**
 * @author Fariha Nawaz
 * @since 2/18/2021
 */

package com.prithila.springrestapi.service;

import com.prithila.springrestapi.model.Employees;

import java.util.List;
import java.util.Optional;

/*
Generating a interface for the services
 */
public interface EmployeeServiceInterface {

    public Employees create(Employees employee);

    public Optional get(Long id);

    public Employees update(Employees employees, Long Id);

    public void delete(Long id);

    public List<Employees> list();
}
