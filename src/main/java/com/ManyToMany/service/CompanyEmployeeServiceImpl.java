package com.ManyToMany.service;

import com.ManyToMany.entity.CompanyEmployee;
import com.ManyToMany.repository.CompanyEmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyEmployeeServiceImpl implements CompanyEmployeeService {

    private final CompanyEmployeeRepository companyEmployeeRepository;

    public CompanyEmployeeServiceImpl(CompanyEmployeeRepository companyEmployeeRepository) {
        this.companyEmployeeRepository = companyEmployeeRepository;
    }

    @Override
    public CompanyEmployee create(CompanyEmployee companyEmployee) {
        return companyEmployeeRepository.save(companyEmployee);
    }

    @Override
    public void delete(long company_id, long employee_id) {
        CompanyEmployee companyEmployee = companyEmployeeRepository.getOne(company_id, employee_id);
        companyEmployeeRepository.delete(companyEmployee.getId());
    }
}
