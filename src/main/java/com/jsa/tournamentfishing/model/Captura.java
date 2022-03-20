package com.jsa.tournamentfishing.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_CAPTURAS")
public class Captura {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;

    @NotNull
    @Column (name = "ID_TORNEO")
    private Long idTorneo;

    @NotNull
    @Column (name = "ID_PERSONA")
    private Long idPersona;

    @NotNull
    @Column (name = "ID_ESPECIE")
    private Long idespecie;

    @NotNull
    @Column (name = "NUM_TALLA")
    private Long numTalla;

    @NotNull
    @Column (name = "FE_CAPTURA")
    private LocalDate feCaptura;
}
