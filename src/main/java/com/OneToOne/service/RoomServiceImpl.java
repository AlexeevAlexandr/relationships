package com.OneToOne.service;

import com.OneToOne.entity.Room;
import com.OneToOne.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room getById(long id) {
        return roomRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        roomRepository.delete(id);
    }
}
