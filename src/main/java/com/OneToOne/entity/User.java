package com.OneToOne.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;

    public User(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, name: %s, room: %s}", id, name, room);
    }
}
