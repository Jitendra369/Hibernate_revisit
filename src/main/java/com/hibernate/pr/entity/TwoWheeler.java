package com.hibernate.pr.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class TwoWheeler extends Vehicle {

    private int engineCC;
    private String typeOfBike;

}
