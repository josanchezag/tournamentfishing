package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Club;
import com.jsa.tournamentfishing.model.Departamento;
import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.repository.ClubRepository;
import com.jsa.tournamentfishing.repository.DepartamentoRepository;
import com.jsa.tournamentfishing.repository.PersonaRepository;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Departamentos")
public class DepartamentoRestController {


    @Autowired
    DepartamentoRepository repo;

    @GetMapping
    public List<Departamento> getAll(){
        Comparator<Departamento> cp1= (Departamento p1, Departamento  p2) -> p1.getDsDepartamento().compareTo(p2.getDsDepartamento());
        return repo.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento insertPerson(@RequestBody Departamento p){

        return repo.save(p);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Departamento modifyPerson(@RequestBody Departamento p){
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