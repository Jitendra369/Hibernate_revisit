package com.hibernate.pr.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rev_id")
    private Integer id;

    @Column(name = "usr_name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    private Product product;


}
