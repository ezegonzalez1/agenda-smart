package com.juanieze.agenda.RestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.juanieze.agenda.LogicaNegocio.IngresoService;

@RestController
public class UsuariosRestService {
	
	@Autowired
	IngresoService ingresoService;
	
	/*
	@GetMapping("/testservice")
	public boolean testserivce() {
		return ingresoService.ingresar("a", "b");
	}
	*/
	
	@GetMapping("/novedades")
	public String obtenerNovedades(@RequestParam(value = "mail") String mail, @RequestParam(value = "password") String password) {
		try {
			return ingresoService.ingresar(mail, password);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No exixste el usuario", e);
		}

	}
}


