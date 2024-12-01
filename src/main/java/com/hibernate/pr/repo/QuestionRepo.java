package com.hibernate.pr.repo;


import com.hibernate.pr.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
