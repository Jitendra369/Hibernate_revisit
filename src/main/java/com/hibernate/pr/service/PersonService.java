package com.hibernate.pr.service;

import com.hibernate.pr.entity.Employee;
import com.hibernate.pr.entity.Person;
import com.hibernate.pr.entity.Student;
import com.hibernate.pr.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepo personRepo;

    public Student saveStudent(Student student){
       return personRepo.save(student);
    }

    public Person savePreson(Employee employee){
        return personRepo.save(employee);
    }

    public Person getPerson(int id) {
        Person person = null;
        Optional<Person> personOptional = personRepo.findById(id);
        if (personOptional.isPresent()) {
            person = personOptional.get();
            if (person instanceof Student) {
                return (Student) person;
            } else if (person instanceof Employee) {
                return (Employee) person;
            }
        }
        return person;
    }
}
