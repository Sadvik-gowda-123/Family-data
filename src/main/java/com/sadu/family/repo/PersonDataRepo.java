package com.sadu.family.repo;

import com.sadu.family.dto.PersonDataDto;
import com.sadu.family.service.AgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonDataRepo {

    @Autowired
    private AgeService ageService;

    public static Map<String, PersonDataDto> personDetails;

    public Map getPersonDetails() {
        return setPersonData();
    }

    private Map setPersonData() {
        Map<String, PersonDataDto> detailsMap = new HashMap<>();
        detailsMap.put("SADVIK", getSadvikData());
        detailsMap.put("MANU", getManuData());
        detailsMap.put("ANVI", getAnviData());
        return detailsMap;
    }

    private PersonDataDto getAnviData() {
        LocalDate birthDate = LocalDate.of(2007, 5, 12);
        return PersonDataDto.builder()
                .name("Anvi B D").motherName("Shashikala").fatherName("Ramesh")
                .dateOfBirth(birthDate)
                .age(ageService.getCurrentAge(birthDate))
                .address("Chakodbaylu")
                .imageName("anvi")
                .build();

    }

    private PersonDataDto getSadvikData() {
        LocalDate birthDate = LocalDate.of(1999, 4, 20);
        return PersonDataDto.builder()
                .name("Sadvik B D").motherName("Shakila").fatherName("Divakar")
                .dateOfBirth(birthDate)
                .age(ageService.getCurrentAge(birthDate))
                .address("Neelakantamakki")
                .imageName("sadvik")
                .build();

    }

    private PersonDataDto getManuData() {
        LocalDate birthDate = LocalDate.of(1986, 3, 20);
        return PersonDataDto.builder()
                .name("Manu j").motherName("Sushila").fatherName("Jagdeesh")
                .dateOfBirth(birthDate)
                .age(ageService.getCurrentAge(birthDate))
                .address("Konegadde").imageName("manu").build();

    }
}
