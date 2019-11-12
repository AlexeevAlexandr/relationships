package com.ManyToOne_OneToMany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public Human(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, name: %s, address: %s}", id, name, address);

    }
}
