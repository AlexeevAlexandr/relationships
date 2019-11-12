package com.ManyToMany.service;

import com.ManyToMany.entity.CompanyEmployee;

public interface CompanyEmployeeService {

    CompanyEmployee create(CompanyEmployee companyEmployee);

    void delete(long company_id, long employee_id);
}
