package com.ManyToMany.service;

import com.ManyToMany.entity.Company;
import com.ManyToMany.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getById(long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company getByName(String name) {
        return companyRepository.findByName(name);
    }

    @Override
    public Company create(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company update(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void delete(long id) {
        companyRepository.delete(id);
    }
}
