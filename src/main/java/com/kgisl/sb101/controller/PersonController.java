package com.kgisl.sb101.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kgisl.sb101.entity.Person;
import com.kgisl.sb101.repository.PersonRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/Person")
@RestController
public class PersonController {

    PersonRepository personRepository;

    PersonController(PersonRepository personRepository) {

        this.personRepository = personRepository;

    }

    @GetMapping
    public List<Person> getAllPersons() {
        // System.out.println("######################");
        // System.out.println(personRepository.findAll());
        return personRepository.findAll();

    }
    
    

}