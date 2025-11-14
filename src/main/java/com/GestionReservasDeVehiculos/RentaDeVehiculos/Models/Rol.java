package com.GestionReservasDeVehiculos.RentaDeVehiculos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios = new ArrayList<>();
}
