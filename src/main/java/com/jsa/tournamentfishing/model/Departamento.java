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
@Table(name = "TTOFI_DEPARTAMENTOS")
public class Departamento {

    @Id
    @NotNull
    @Column(name = "ID_DEPARTAMENTO", length = 2)
    private Integer idDepartamento;// int(2) unsigned NOT NULL AUTO_INCREMENT,

    @NotNull
    @Column(name = "DEPARTAMENTO", length = 255)
    private String dsDepartamento;// varchar(255) NOT NULL DEFAULT '',
}
