package com.hibernate.pr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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

    @OneToOne(cascade = CascadeType.PERSIST)  // if question save then answer should be saved
//    @JoinColumn(name = "answer_id", referencedColumnName = "answer_id") // specify the new col name for answer-id , target col-name reference
    private Answer answer;


}
