package com.example.demo.service;

import com.example.demo.dao.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;


    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonByperson_Id(Long person_id) {
        return personRepository.findById(person_id).orElse(null);
    }

    @Override
    public List<Person> getPersonByName(String name) {

        return personRepository.findByName(name);
    }

    @Override
    public List<Person> getPersonByAge(int age) {
        return personRepository.findByAge(age);
    }
}
