package com.jsa.tournamentfishing.controller;

import com.jsa.tournamentfishing.model.Torneo;
import com.jsa.tournamentfishing.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Torneos")
public class TorneoRestController {


    @Autowired
     TorneoRepository repo;

    @GetMapping
    public List<Torneo> getAll(){
        Comparator<Torneo> cp1= (Torneo p1, Torneo  p2) -> p1.getDsNombre().compareTo(p2.getDsNombre());
        return repo.findAll().stream().sorted(cp1).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public Torneo getAllyId(@PathVariable Long id){
        return repo.findById(id).get();
    }
    @GetMapping("/Admin/{id}")
    public List<Torneo> getAllyAdminId(@PathVariable String id){
        Comparator<Torneo> cp1= (Torneo p1, Torneo  p2) -> p1.getDsNombre().compareTo(p2.getDsNombre());
        return repo.findByidOrganizador(id).stream().sorted(cp1).collect(Collectors.toList());
    }
    @PostMapping
    public Torneo insertPerson(@RequestBody Torneo p){
        p.setFeCreacion(LocalDate.now());
        return repo.save(p);
    }

    @PutMapping
    public Torneo modifyPerson(@RequestBody Torneo p){
        return repo.save(p);
    }

    @PatchMapping("/Activator")
    public Torneo modifyPersonId(
                @RequestParam(value = "id", required = false) Long id){
        Torneo p1= repo.findById(id).get();
        return repo.save(new Torneo(
                    id,
                    p1.getDsNombre(),
                    p1.getDsCiudad(),
                    p1.getIdOrganizador(),
                    LocalDate.now(),
                    p1.getFeFin(),
                    p1.getFeCreacion(),
                    "S"));
    }

    @DeleteMapping()
    public void deletePersonbyId(
            @RequestParam(value = "kdni", required = false) Long id){
        repo.deleteById(id);
    }

}