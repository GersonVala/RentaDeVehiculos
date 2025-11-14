package com.GestionReservasDeVehiculos.RentaDeVehiculos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="vehiculos")
@Setter
@Getter
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name="id_vehiculo")
    private Integer idVehiculo;
    private String marca;
    private String modelo;
    private String color;
    @Column(unique = true)
    private String patente;
    @Column(name = "precio_diario")
    private double precioDiario;
    @Column(name = "cant_puertas")
    private Integer cantPuertas;
    @JoinColumn(name = "id_motor", nullable = false)
    @ManyToOne(optional = false)
    private Motor motor;

    @JoinColumn(name = "id_tipo_vehiculo", nullable = false)
    @ManyToOne(optional = false)
    private TipoVehiculo tipoVehiculo;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoVehiculo estado = EstadoVehiculo.DISPONIBLE;
    private String descripcion;

    @JoinColumn(name = "id_sucursal", nullable = false)
    @ManyToOne(optional = false)
    private Sucursal sucursal;

}
