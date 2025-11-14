package com.GestionReservasDeVehiculos.RentaDeVehiculos.services;

import com.GestionReservasDeVehiculos.RentaDeVehiculos.DTO.UsuarioRegistroDTO;
import com.GestionReservasDeVehiculos.RentaDeVehiculos.Models.Usuario;
import com.GestionReservasDeVehiculos.RentaDeVehiculos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class UsuarioServiceImp implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario saveUsuario(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(registroDTO.getNombre());
        usuario.setApellido(registroDTO.getApellido());
        usuario.setEmail(registroDTO.getEmail());
        usuario.setContra(registroDTO.getContra());
        usuario.setDni(registroDTO.getDni());
        usuario.setTelefono(registroDTO.getTelefono());
        usuario.setDireccion(registroDTO.getDireccion());
        return usuarioRepository.save(usuario);
    }
}
