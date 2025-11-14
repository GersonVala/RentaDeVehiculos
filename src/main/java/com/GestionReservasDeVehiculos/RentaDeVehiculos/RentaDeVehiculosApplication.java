package com.GestionReservasDeVehiculos.RentaDeVehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RentaDeVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentaDeVehiculosApplication.class, args);
	}

}
