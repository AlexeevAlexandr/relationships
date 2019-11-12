package com.OneToOne.service;

import com.OneToOne.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(long id);
    User save(User user);
    void delete(long id);
}
