package com.sadu.family.controller;

import com.sadu.family.dto.PersonDataDto;
import com.sadu.family.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/get-data/{name}")
    public ResponseEntity<PersonDataDto> getPersonByName(@PathVariable("name") String name) {
        PersonDataDto responseData = personService.getPersonByName(name);
        return new ResponseEntity<>(responseData, HttpStatus.OK);

    }
}
