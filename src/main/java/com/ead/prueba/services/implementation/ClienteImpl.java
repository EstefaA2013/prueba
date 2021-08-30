package com.ead.prueba.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ClienteDTO;
import com.ead.prueba.dto.ClienteRequest;
import com.ead.prueba.entities.Cliente;
import com.ead.prueba.repository.ClienteRepository;
import com.ead.prueba.services.interfaces.IClienteService;
import com.ead.prueba.utils.helpers.MHelpers;

@Component
public class ClienteImpl implements IClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<ClienteDTO> findAll() {


		List<ClienteDTO> dto = new ArrayList<>();
		
		Iterable<Cliente> clientes = this.clienteRepository.findAll();
		
		for (Cliente cliente : clientes) {
	    	
	    	ClienteDTO clienteDTO = MHelpers.modelMapper().map(cliente, ClienteDTO.class);
    
        	dto.add(clienteDTO);
	    }
		
		return dto;
	}

	@Override
	public ClienteDTO findByCustomerId(int clienteId) {
       
		Optional<Cliente> cliente = this.clienteRepository.findById(clienteId);
        
        if(!cliente.isPresent()) {
        	return null;
        }
        
        return MHelpers.modelMapper().map(cliente.get(), ClienteDTO.class);
	
	}

	@Override
	public void save(ClienteRequest cliente) {

		Cliente clientes = MHelpers.modelMapper().map(cliente, Cliente.class);

		this.clienteRepository.save(clientes);
	}

	@Override
	public void update(ClienteRequest request, int clienteId) {
		Optional<Cliente> clientes = this.clienteRepository.findById(clienteId);

		Cliente cliente = clientes.get();

		cliente.setNombre(request.getNombre());
		cliente.setApellido(request.getApellido());
		cliente.setCedula(request.getCedula());
		cliente.setCelular(request.getCelular());

		this.clienteRepository.save(cliente);

	}

	@Override
	public void saveAll(List<ClienteRequest> clientes) {
		List<Cliente> c = new ArrayList<>();

		for (ClienteRequest cliente : clientes) {

			Cliente cl = MHelpers.modelMapper().map(clientes, Cliente.class);

			c.add(cl);
		}

		this.clienteRepository.saveAll(c);

	}

	@Override
	public void deleteById(int clienteId) {
		
		this.clienteRepository.deleteById(clienteId);
	}
	
	private ClienteDTO convertToUsersDTO(final Cliente cliente) {
	    return MHelpers.modelMapper().map(cliente, ClienteDTO.class);
	}

	
}
