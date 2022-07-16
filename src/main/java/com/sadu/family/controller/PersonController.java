package com.sadu.family.controller;

import com.sadu.family.dto.PersonDataDto;
import com.sadu.family.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String msg(){
        log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7777");
        log.info("msg method is called");
        return "Welcome to app";
    }

    @GetMapping("/get-data/{name}")
    public ResponseEntity<PersonDataDto> getPersonByName(@PathVariable("name") String name) {
        log.info("getPersonByName method is called");

        PersonDataDto responseData = personService.getPersonByName(name);
        return new ResponseEntity<>(responseData, HttpStatus.OK);

    }
}
