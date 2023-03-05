package com.sadu.family.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDataDto {

    private String name;
    private String age;
    private LocalDate dateOfBirth;
    private String fatherName;
    private String motherName;
    private String address;
    private String imageName;

}
