package com.GestionReservasDeVehiculos.RentaDeVehiculos.DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRegistroDTO {
    @Size(max = 50)
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @Size(max = 50)
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @Size(max = 50)
    @NotBlank(message = "El email es obligatorio")
    private String email;
    @Size(max = 50)
    @NotBlank(message = "La contraseña es obligatoria")
    private String contra;

    @Size(max = 50)
    @NotBlank(message = "El DNI es obligatorio")
    private String dni;
    @Size(max = 50)
    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @Size(max = 255, message = "La dirección es demasiado larga")
    private String direccion;
}