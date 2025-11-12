package com.GestionReservasDeVehiculos.RentaDeVehiculos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "motores")
@Getter
@Setter
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_motor")
    private Integer idMotor;
    private String cilindrada;

    // enum: tipo de combustible
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_combustible", nullable = false)
    private TipoCombustible tipoCombustible;

    // enum: tipo de motor
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_motor", nullable = false)
    private TipoMotor tipoMotor;

    @OneToMany(mappedBy = "motor")
    private List<Vehiculo> vehiculo=new ArrayList<>();
}
