package com.ManyToOne_OneToMany.service;

import com.ManyToOne_OneToMany.entity.Address;
import com.ManyToOne_OneToMany.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(long id) {
        addressRepository.delete(id);
    }
}
