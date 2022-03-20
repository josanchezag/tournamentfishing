package com.jsa.tournamentfishing.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_CIUDADES")
public class Ciudad {

    @Id
    @NotNull
    @Column (name ="ID_MUNICIPIO", length = 6)
    private  Integer idMunicipio;// int(6) unsigned NOT NULL AUTO_INCREMENT,

    @NotNull
    @Column (name ="MUNICIPIO", length = 255)
    private String dsMunicipio;// varchar(255) NOT NULL DEFAULT '',

    @NotNull
    @Column (name ="ESTADO", length = 1)
    private Integer cdEstado;//` int(1) unsigned NOT NULL,

    @NotNull
    @Column (name ="DEPARTAMENTO_ID", length = 2)
    private  Integer idDepartamento;//` int(2) unsigned NOT NULL,
}
