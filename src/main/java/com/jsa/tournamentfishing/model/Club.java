package com.jsa.tournamentfishing.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_CLUBS")
public class Club {

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

    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
    @Column(name = "picByte")
    private byte[] picByte;
}
