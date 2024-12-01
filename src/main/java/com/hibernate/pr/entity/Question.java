package com.hibernate.pr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ques_id")
    private int questionId;

    @Column(name = "question")
    private String question;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "answer_id", referencedColumnName = "answer_id")
    private Answer answer;


}
