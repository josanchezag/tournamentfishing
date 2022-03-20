package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Captura;
import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.repository.CapturaRepository;
import com.jsa.tournamentfishing.repository.PersonaRepository;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Capturass")
public class CapturaRestController {


    @Autowired
    CapturaRepository repo;



    @GetMapping
    public List<Captura> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Captura insertPerson(@RequestBody Captura p){
        return repo.save(p);
    }

    @PutMapping
    public Captura modifyPerson(@RequestBody Captura p){
        return repo.save(p);
    }

    @DeleteMapping()
    public void deletePersonbyId(@RequestParam(value = "id", required = false) Long id){
         repo.deleteById(id);
    }

}
