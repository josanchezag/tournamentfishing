package com.jsa.tournamentfishing.util;

import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class UtilPersonImpl implements IUtilPerson {

    @Override
    public Integer getAge(Person p) {
        return Period.between(p.getFenacimiento(),LocalDate.now()).getYears();
    }
}
