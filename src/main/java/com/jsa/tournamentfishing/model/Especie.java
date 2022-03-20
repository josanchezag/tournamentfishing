package com.jsa.tournamentfishing.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_ESPECIES")
public class Especie {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "DS_NOMBRE", length = 50)
    @NotNull
    private String dsNombre;

    @Column (name = "DS_NOMBRE_CIENTIFICO", length = 100)
    @NotNull
    private String dsNombreCientifico;

    @Column (name = "NUM_TALLA_MIN")
    @NotNull
    private Integer numTallaMin;

    @Column (length = 1, name="SN_FRESHWATER")
    @NotNull
    private String snFreshWater;

    @Column (length = 1, name="SN_ENDEMICA")
    @NotNull
    private String snEndemica;

    @Column (name="DS_RESUMEN")
    private String dsResumen;

    @Column (length = 1, name="SN_ACTIVO")
    @NotNull
    private String snActivo;
}
