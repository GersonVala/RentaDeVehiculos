package com.GestionReservasDeVehiculos.RentaDeVehiculos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservas")
@Getter
@Setter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer idReserva;

    @Column(name="fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name="fecha_fin")
    private LocalDateTime fechaFin;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private Estado estado = Estado.DISPONIBLE;

    @Column(name="precio",precision = 10, scale = 2)
    private double precioReserva;

    @Enumerated(EnumType.STRING)
    @Column(name = "metodo_pago", nullable = false)
    private MetodoPago metodoPago;

    @JoinColumn(name="id_usuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    @JoinColumn(name="id_sucursal_retiro",nullable = false)
    @ManyToOne(optional = false)
    private Sucursal sucursalRetiro;

    @JoinColumn(name="id_sucursal_devolucion",nullable = false)
    @ManyToOne(optional = false)
    private Sucursal sucursalDevolucion;

    @ManyToOne(optional = false)
    @JoinColumn(name="id_vehiculo", nullable = false)
    private Vehiculo vehiculo;

}
