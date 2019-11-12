package com.ManyToOne_OneToMany.service;

import com.ManyToOne_OneToMany.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAll();

    Address create(Address address);

    void delete(long id);
}
