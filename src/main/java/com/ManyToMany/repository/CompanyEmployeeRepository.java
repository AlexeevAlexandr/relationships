package com.ManyToMany.repository;

import com.ManyToMany.entity.CompanyEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyEmployeeRepository extends CrudRepository<CompanyEmployee, Long> {

    @Query(value = "SELECT u FROM CompanyEmployee u WHERE u.company_id = ?1 AND u.employee_id = ?2")
    CompanyEmployee getOne(long company_id, long employee_id);
}
