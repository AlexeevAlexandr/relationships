package com.ManyToOne_OneToMany.service;

import com.ManyToOne_OneToMany.entity.Human;
import com.ManyToOne_OneToMany.repository.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanServiceImpl implements HumanService {

    private final HumanRepository humanRepository;

    public HumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public Human create(Human human) {
        return humanRepository.save(human);
    }

    @Override
    public List<Human> getAll() {
        return humanRepository.findAll();
    }

    @Override
    public void delete(long id) {
        humanRepository.delete(id);
    }
}
