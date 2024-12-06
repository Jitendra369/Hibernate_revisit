package com.hibernate.pr.service;

import com.hibernate.pr.entity.Student;
import com.hibernate.pr.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepo personRepo;

    public Student saveStudent(Student student){
       return personRepo.save(student);
    }
}
