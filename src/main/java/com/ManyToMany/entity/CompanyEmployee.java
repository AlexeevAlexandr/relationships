package com.ManyToMany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CompanyEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long employee_id;
    private long company_id;

    public CompanyEmployee(long employee_id, long company_id) {
        this.employee_id = employee_id;
        this.company_id = company_id;
    }
}
