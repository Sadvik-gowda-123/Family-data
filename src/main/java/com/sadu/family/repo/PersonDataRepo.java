package com.sadu.family.repo;

import com.sadu.family.dto.PersonDataDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonDataRepo {

    public PersonDataRepo() {
        personDetails = this.setPersonData();
    }

    public static Map<String, PersonDataDto> personDetails;

    private Map setPersonData() {
        Map<String,PersonDataDto> detailsMap = new HashMap<>();
        detailsMap.put("SADVIK",getSadvikData());
        detailsMap.put("MANU",getManuData());
        return detailsMap;
    }

    private PersonDataDto getSadvikData(){
        return PersonDataDto.builder()
                .name("Sadvik B D").motherName("Shakila").fatherName("Divakar")
                .deateOfBirth(LocalDate.of(1999,4,20))
                .address("Neelakantamakki").build();

    }

    private PersonDataDto getManuData(){
        return PersonDataDto.builder()
                .name("Manu j").motherName("Sushila").fatherName("Jagdeesh")
                .deateOfBirth(LocalDate.of(1855,7,25))
                .address("Konegadde").build();

    }
}
