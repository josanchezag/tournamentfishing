package com.jsa.tournamentfishing.repository;

import com.jsa.tournamentfishing.model.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepository extends JpaRepository<Especie, Long> {
}