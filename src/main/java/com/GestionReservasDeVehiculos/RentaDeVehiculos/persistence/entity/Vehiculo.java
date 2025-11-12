package com.GestionReservasDeVehiculos.RentaDeVehiculos.persistence.entity;

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
    private String patente;
    @Column(name = "precio_diario",precision = 10,scale = 2)
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
    private Estado estado = Estado.DISPONIBLE;
    private String descripcion;

    @JoinColumn(name = "id_sucursal", nullable = false)
    @ManyToOne(optional = false)
    private Sucursal sucursal;

}
