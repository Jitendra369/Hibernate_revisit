package com.hibernate.pr.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Employee extends Person {

    private String empId;
    private String companyName;
    private String compLocation;
}
