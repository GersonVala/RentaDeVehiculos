package com.GestionReservasDeVehiculos.RentaDeVehiculos.repository;

import com.GestionReservasDeVehiculos.RentaDeVehiculos.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
