package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.repository.PersonaRepository;
import com.jsa.tournamentfishing.util.Interface.IUtilPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Personas")
public class PersonaRestController {


    @Autowired
    PersonaRepository person;

    //Instancia de la interface persona
    @Autowired
    IUtilPerson utilPer;

    @GetMapping
    public List<Person> getAll(){
        Comparator<Person> cp1= (Person p1, Person  p2) -> p1.getDni().compareToIgnoreCase(p2.getDni());
        return person.findAll()
                .stream()
                .sorted(cp1)
                .collect(Collectors.toList());
    }

    @GetMapping("/mayorEdad")
    public  List<Person> getMayorEdad(){

        return person.findAll()
                .stream()
                .filter(x-> utilPer.getAge(x)>18)
                .collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person insertPerson(@RequestBody Person p){

        return "".equals(person.findByKdniAndDni(p.getKdni(),p.getDni()).get().getDni())?
                null:
                person.save(p);
        //return person.save(p);
    }

    @PutMapping
    public Person modifyPerson(@RequestBody Person p){
        return person.save(p);
    }

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

    @DeleteMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePersonbyId(
            @RequestParam(value = "id", required = false) Long id){
         person.deleteById(id);
    }

    @DeleteMapping("/DeletebyKdniAndDni")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePersonbyKdniAndDni(
            @RequestParam(value = "kdni", required = false) String kdni,
            @RequestParam(value = "dni", required = false) String dni){
        Person p1= person.findByKdniAndDni(kdni,dni).get();
        person.deleteById(p1.getId());
    }

}
