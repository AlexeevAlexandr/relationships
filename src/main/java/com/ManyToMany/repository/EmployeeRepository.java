package com.ManyToMany.repository;

import com.ManyToMany.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    List<Employee> findAll();

    Employee findById(long id);

    Employee getByName(String name);
}
