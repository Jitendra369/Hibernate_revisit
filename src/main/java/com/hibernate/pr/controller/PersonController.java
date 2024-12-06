package com.hibernate.pr.controller;

import com.hibernate.pr.entity.Employee;
import com.hibernate.pr.entity.Person;
import com.hibernate.pr.entity.Student;
import com.hibernate.pr.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/stu")
    public void saveStudent(@RequestBody Student student){
        personService.saveStudent(student);
    }

    @PostMapping("/emp")
    public Person saveEmployee(@RequestBody Employee employee){
       return personService.savePreson(employee);
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable int id){
        return personService.getPerson(id);
    }
}
