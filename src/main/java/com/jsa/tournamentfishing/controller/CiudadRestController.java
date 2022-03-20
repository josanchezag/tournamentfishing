package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Ciudad;
import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.repository.CiudadRepository;
import com.jsa.tournamentfishing.repository.PersonaRepository;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ciudades")
public class CiudadRestController {


    @Autowired
    CiudadRepository repo;

    @GetMapping
    public List<Ciudad> getAll(){
        Comparator<Ciudad> cp1= (Ciudad p1, Ciudad  p2) -> p1.getDsMunicipio().compareTo(p2.getDsMunicipio());
        return repo.findAll();
    }
    @PostMapping
    public Ciudad insertPerson(@RequestBody Ciudad p){

        return repo.save(p);
    }

    @PutMapping
    public Ciudad modifyPerson(@RequestBody Ciudad p){
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
            @RequestParam(value = "kdni", required = false) Integer id){
         repo.deleteById(id);
    }

}
