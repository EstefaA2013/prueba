package com.ead.prueba.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.ClienteDTO;
import com.ead.prueba.dto.ClienteRequest;


@Service
public interface IClienteService {
	
	List<ClienteDTO> findAll();
	
	ClienteDTO findByCustomerId(int clienteId);
	
	void save(ClienteRequest cliente);
	
	void update(ClienteRequest cliente, int clienteId);
	
	void saveAll(List<ClienteRequest> cliente);
	
	void deleteById(int clienteId);

}
