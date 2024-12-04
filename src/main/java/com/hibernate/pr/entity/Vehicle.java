package com.hibernate.pr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String companyName;

    private float topSpeed;
    private int seats;
    private float cost;
    private Date dateOfManufacturer;


}
