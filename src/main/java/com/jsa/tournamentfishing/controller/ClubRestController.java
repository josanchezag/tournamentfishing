package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Ciudad;
import com.jsa.tournamentfishing.model.Club;
import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.repository.CiudadRepository;
import com.jsa.tournamentfishing.repository.ClubRepository;
import com.jsa.tournamentfishing.repository.PersonaRepository;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Club")
public class ClubRestController {


    @Autowired
    ClubRepository repo;

    @GetMapping
    public List<Club> getAll(){
        Comparator<Club> cp1= (Club p1, Club  p2) -> p1.getDsNombre().compareTo(p2.getDsNombre());
        return repo.findAll();
    }
    @PostMapping
    public Club insertPerson(@RequestBody Club p){

        return repo.save(p);
    }

    @PutMapping
    public Club modifyPerson(@RequestBody Club p){
        return repo.save(p);
    }
    /*
        @PatchMapping()
        public Person modifyPersonId(
                @RequestParam(value = "kdni", required = false) String kdni,
                @RequestParam(value = "dni", required = false) String dni,
                @RequestBody Person p){

            Person p1= person.findByKdniAndDni(kdni,dni).get();
            return person.save(new Person(
                    p1.getId(),
                    kdni,
                    dni,
                    p1.getNombre(),
                    p1.getApellido(),
                    p1.getCelular(),
                    p1.getTelefono2(),
                    p1.getEmail(),
                    p1.getSn_envaioemail(),
                    p1.getFenacimiento()));
        }
    */
    @DeleteMapping()
    public void deletePersonbyId(
            @RequestParam(value = "kdni", required = false) Long id){
        repo.deleteById(id);
    }

}