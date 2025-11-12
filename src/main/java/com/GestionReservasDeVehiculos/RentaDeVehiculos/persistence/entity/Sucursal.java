package com.GestionReservasDeVehiculos.RentaDeVehiculos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sucursales")
@Getter
@Setter
public class Sucursal {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name="id_sucursal")
    private Integer idSucursal;
    private String nombre;
    private String direccion;
    private boolean estado;

    @OneToMany(mappedBy = "sucursal")
    private List<Vehiculo> vehiculos=new ArrayList<>();

    @OneToMany(mappedBy = "sucursal")
    private List<Empleado> empleados = new ArrayList<>();

}
