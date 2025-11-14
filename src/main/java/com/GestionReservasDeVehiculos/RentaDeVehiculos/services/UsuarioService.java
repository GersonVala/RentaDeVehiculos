package com.GestionReservasDeVehiculos.RentaDeVehiculos.services;

import com.GestionReservasDeVehiculos.RentaDeVehiculos.DTO.UsuarioRegistroDTO;
import com.GestionReservasDeVehiculos.RentaDeVehiculos.Models.Usuario;

public interface UsuarioService {
    public Usuario saveUsuario(UsuarioRegistroDTO registroDTO);
}
