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
public class FourWheeler extends Vehicle{

    private int numberOfDoor;
    private int numberOfSeat;
    private boolean isRoofPresent;

}
