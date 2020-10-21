package com.juanieze.agenda.LogicaNegocio;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanieze.agenda.Entidades.Cliente;
import com.juanieze.agenda.Repositorios.ClienteRepository;

@Service
public class IngresoService {
	
	Logger logger = LoggerFactory.getLogger(IngresoService.class);
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public String ingresar(String mail, String contrasenia) {
		
		List<Cliente> response;
		Cliente c;
		String msj = "Hola, ";
		
		try {
			response = clienteRepository.findByMail("ezeegonzalez94@gmail.com");
			//response = (List<Cliente>) clienteRepository.findAll();
			
	 		msj = msj + response.get(0).getNombre();
	 		
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
 		
 		return msj;
 		
	}
}
