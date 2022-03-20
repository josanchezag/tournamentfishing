package com.jsa.tournamentfishing.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_TORNEOS")
public class Torneo {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "DS_NOMBRE", length = 50)
    @NotNull
    private String dsNombre;

    @Column (name = "DS_CIUDAD", length = 50)
    @NotNull
    private String dsCiudad;

    @Column (name = "ID_ORGANIZADOR")
    @NotNull
    private String idOrganizador;

    @NotNull
    @Column (name = "FE_INI")
    private LocalDate feIni;

    @NotNull
    @Column (name = "FE_FIN")
    private LocalDate feFin;

    @NotNull
    @Column (name = "FE_CREACION")
    private LocalDate feCreacion;

    @Column (length = 1, name="SN_ACTIVO")
    @NotNull
    private String snActivo;
}
