package com.juanieze.agenda.LogicaNegocio;

import org.springframework.stereotype.Service;

@Service
public class IngresoService {
	public String ingresar(String usuario, String contrasenia) {
		// chequea en BD si usuario existe

		return "Hola " + usuario;
	}
}
