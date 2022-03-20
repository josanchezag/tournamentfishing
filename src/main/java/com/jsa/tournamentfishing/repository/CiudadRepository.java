package com.jsa.tournamentfishing.repository;

import com.jsa.tournamentfishing.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
}