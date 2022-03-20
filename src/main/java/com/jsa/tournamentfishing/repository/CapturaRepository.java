package com.jsa.tournamentfishing.repository;

import com.jsa.tournamentfishing.model.Captura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@Qualifier("captura")
public interface CapturaRepository extends JpaRepository<Captura, Long> {
}