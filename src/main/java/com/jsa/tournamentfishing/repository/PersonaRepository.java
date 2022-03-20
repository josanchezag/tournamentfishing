package com.jsa.tournamentfishing.repository;


import com.jsa.tournamentfishing.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;


public interface PersonaRepository extends JpaRepository<Person, Long> {

    @Transactional(readOnly = true)
    public Optional<Person> findByKdniAndDni(String kdni, String dni);


}