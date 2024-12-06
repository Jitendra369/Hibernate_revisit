package com.hibernate.pr.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Student extends Person {

    private String schoolName;
    private String standard;
    private String rollNumber;
}
