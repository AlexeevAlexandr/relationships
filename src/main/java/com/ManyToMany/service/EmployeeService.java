package com.ManyToMany.service;

import com.ManyToMany.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getById(long id);

    Employee getByName(String name);

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(long id);
}
