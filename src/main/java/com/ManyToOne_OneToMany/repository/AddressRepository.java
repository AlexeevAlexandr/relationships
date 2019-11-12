package com.ManyToOne_OneToMany.repository;

import com.ManyToOne_OneToMany.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    @Override
    List<Address> findAll();
}
