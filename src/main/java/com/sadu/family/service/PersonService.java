package com.sadu.family.service;

import com.sadu.family.dto.PersonDataDto;
import com.sadu.family.exception.InvalidNameException;
import com.sadu.family.repo.PersonDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

@Service
public class PersonService {

    public PersonDataDto getPersonByName(String name){
        Map<String, PersonDataDto> personDetails = PersonDataRepo.personDetails;
        return Optional
                .ofNullable(personDetails.get(name.toUpperCase()))
                .orElseThrow(()->new InvalidNameException("Name :".concat(name).concat(" Not Found")));
    }
}
