package com.hibernate.pr.controller;

import com.hibernate.pr.entity.Employee;
import com.hibernate.pr.entity.Student;
import com.hibernate.pr.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/stu")
    public void saveStudent(@RequestBody Student student){
        personService.saveStudent(student);
    }

    @PostMapping("emp")
    public void saveEmployee(Employee employee){

    }
}
