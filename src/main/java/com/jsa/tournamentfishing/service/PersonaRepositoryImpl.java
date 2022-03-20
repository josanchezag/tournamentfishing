package com.jsa.tournamentfishing.service;


import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.service.Interface.IPerson;
import com.jsa.tournamentfishing.util.UtilPersonImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaRepositoryImpl implements IPerson {
    @Autowired
    UtilPersonImpl utlp;

    @Override
    public List<Person> getOlder18(List<Person> p) {
        return p.stream()
                .filter(x-> utlp.getAge(x)>18)
                .collect(Collectors.toList());
    }
}
