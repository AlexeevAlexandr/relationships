package com.ManyToOne_OneToMany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private int room;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy = "address")
    private Set<Human> humans;

    public Address(String street, int room) {
        this.street = street;
        this.room = room;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, street: %s, room: %s}", id, street, room);

    }
}
