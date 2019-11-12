package com.OneToOne.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int floor;
    private int number;
    @OneToOne(mappedBy = "room")
    private User user;

    public Room(int floor, int number) {
        this.floor = floor;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, floor: %d, number: %d}", id, floor, number);
    }
}
