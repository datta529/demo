package com.example.demo.service;

import com.example.demo.dao.Person;

import java.util.List;

public interface PersonService {
       List<Person> getPersons();

       Person getPersonByperson_Id(Long person_id);

       List<Person> getPersonByName(String name);

       List<Person> getPersonByAge(int age);
}
