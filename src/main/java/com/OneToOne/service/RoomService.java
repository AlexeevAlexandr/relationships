package com.OneToOne.service;

import com.OneToOne.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> getAll();
    Room getById(long id);
    void delete(long id);
}
