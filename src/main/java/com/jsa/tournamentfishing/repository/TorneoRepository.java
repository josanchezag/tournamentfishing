package com.jsa.tournamentfishing.repository;

import com.jsa.tournamentfishing.model.Person;
import com.jsa.tournamentfishing.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface TorneoRepository extends JpaRepository<Torneo, Long> {

    @Transactional(readOnly = true)
    public Optional<Torneo> findByidOrganizador(String id);
}