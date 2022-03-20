package com.jsa.tournamentfishing.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TTOFI_PERSONAS")
public class Person {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (length = 5)
    @NotNull
    private String kdni;

    @Column (length = 20)
    @NotNull
    private String dni;

    @Column (length = 40, nullable = false)
    @NotNull
    private String nombre;

    @Column (length = 40)
    @NotNull
    private String apellido;

    @Column (length = 10)
    @NotNull
    private String celular;

    @Column (length = 10)
    private String telefono2;

    @NotNull
    private String email;

    @NotNull
    @Column (length = 1)
    private String sn_envaioemail;

    private LocalDate fenacimiento;
}
