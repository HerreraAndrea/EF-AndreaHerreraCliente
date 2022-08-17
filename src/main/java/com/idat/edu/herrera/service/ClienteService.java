package com.idat.edu.herrera.service;

import java.util.List;

import com.idat.edu.herrera.entity.Cliente;

public interface ClienteService {
	
		List<Cliente> listar();
		Cliente obtenerId(Integer id);
		void guardar(Cliente cliente);
		void eliminar(Integer id);
		void actualizar(Cliente cliente);
}
