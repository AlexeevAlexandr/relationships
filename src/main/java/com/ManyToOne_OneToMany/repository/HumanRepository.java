package com.ManyToOne_OneToMany.repository;

import com.ManyToOne_OneToMany.entity.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {

    @Override
    List<Human> findAll();
}
