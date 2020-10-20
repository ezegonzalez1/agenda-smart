package com.juanieze.agenda.RestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosRestService {
	
	@GetMapping("/testservice")
	public boolean testserivce() {
		return true;
	}

}


