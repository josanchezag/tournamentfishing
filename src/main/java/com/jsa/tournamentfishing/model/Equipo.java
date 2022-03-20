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
@Table(name = "TTOFI_EQUIPOS")
public class Equipo {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "DS_NOMBRE", length = 50)
    @NotNull
    private String dsNombre;

    @Column (name = "DS_CIUDAD", length = 50)
    @NotNull
    private String dsCiudad;

    @Column (length = 1, name="SN_ACTIVO")
    @NotNull
    private String snActivo;
}
