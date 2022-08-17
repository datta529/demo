package com.example.demo.controllers;

import com.example.demo.dao.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/get-persons")
    public List<Person> getpersons() {

        return personService.getPersons();
    }

    @GetMapping("/person_id/{person_id}")
    public Person getPersonByperson_Id(@PathVariable("person_id") Long person_id) {
        return personService.getPersonByperson_Id(person_id);
    }

    @GetMapping("/name/{name}")
    public List<Person> getPersonByName(@PathVariable("name") String name) {
        return personService.getPersonByName(name);

    }
    @GetMapping("/age/{age}")
        public List<Person> getPersonByage(@PathVariable("age") int age) {
            return personService.getPersonByAge(age);
    }
}

