package com.GestionReservasDeVehiculos.RentaDeVehiculos.controllers;

import com.GestionReservasDeVehiculos.RentaDeVehiculos.DTO.UsuarioRegistroDTO;
import com.GestionReservasDeVehiculos.RentaDeVehiculos.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistroUsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public RegistroUsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO nuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    @PostMapping
    public String registrarUsuarioCuenta(@Valid @ModelAttribute("usuario") UsuarioRegistroDTO registroDTO,
                                         BindingResult bindingResult,
                                         Model model) {
        // Si hay errores de validación, volver al formulario y mostrar mensajes
        if (bindingResult.hasErrors()) {
            return "registro";
        }

        // Aquí puedes añadir comprobaciones adicionales (ej: duplicados, confirmPassword, etc.)
        usuarioService.saveUsuario(registroDTO);
        return "redirect:/register?exito";
    }
}