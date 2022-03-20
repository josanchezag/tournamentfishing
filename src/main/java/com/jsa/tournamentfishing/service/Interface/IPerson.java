package com.jsa.tournamentfishing.service.Interface;

import com.jsa.tournamentfishing.model.Person;

import java.util.List;

public interface IPerson {
    public List<Person> getOlder18(List<Person> p);
}
