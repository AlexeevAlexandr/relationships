package com.ManyToMany.repository;

import com.ManyToMany.entity.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Override
    List<Company> findAll();

    Company findById(long id);

    Company findByName(String name);
}
