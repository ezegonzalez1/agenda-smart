package com.juanieze.agenda.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.juanieze.agenda.Entidades.Cliente;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	

	List<Cliente> findByMail(String mail);
	

}
