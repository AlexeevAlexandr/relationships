package com.ManyToOne_OneToMany.service;

import com.ManyToOne_OneToMany.entity.Human;

import java.util.List;

public interface HumanService {

    Human create(Human human);

    List<Human> getAll();

    void delete(long id);
}
