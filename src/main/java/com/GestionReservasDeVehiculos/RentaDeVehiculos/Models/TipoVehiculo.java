package com.GestionReservasDeVehiculos.RentaDeVehiculos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tipo_vehiculo")
@Getter
@Setter
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_tipo_vehiculo")
    private Integer idTipoVehiculo;
    private String tipo;
    private String caracteristicas;

    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Vehiculo> vehiculos=new ArrayList<>();

}
