package com.sadu.family.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeService {

    public String getCurrentAge(LocalDate dateOfBirth) {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return new StringBuilder()
                .append(period.getYears())
                .append(" Years ")
                .append(period.getMonths())
                .append(" Months ")
                .append(period.getDays())
                .append(" Days")
                .toString();

    }
}
