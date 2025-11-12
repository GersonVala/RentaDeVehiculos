package com.GestionReservasDeVehiculos.RentaDeVehiculos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="usuarios")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;

    private String nombre;
    private String apellido;
    private String email;
    private String contra;
    private String dni;
    private String telefono;
    private String direccion;
    private boolean estado;
    @ManyToOne(optional = false)
    @JoinColumn(name="id_rol")
    private Rol rol;

    @OneToMany(mappedBy = "usuario")
    private List<Empleado> empleados = new ArrayList<>();

}
