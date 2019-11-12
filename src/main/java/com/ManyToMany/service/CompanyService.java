package com.ManyToMany.service;

import com.ManyToMany.entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAll();

    Company getById(long id);

    Company getByName(String name);

    Company create(Company company);

    Company update(Company company);

    void delete(long id);
}
