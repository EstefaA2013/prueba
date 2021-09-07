package com.ead.prueba.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ead.prueba.dto.LogisticaDTO;
import com.ead.prueba.dto.LogisticaRequest;
import com.ead.prueba.entities.Logistica;
import com.ead.prueba.repository.LogisticRepository;
import com.ead.prueba.services.interfaces.ILogisticService;
import com.ead.prueba.utils.helpers.MHelpers;

@Component
public class LogisticImpl implements ILogisticService {

	@Autowired
	private LogisticRepository logisticRepository;
	
	@Override
	public List<LogisticaDTO> findAll() {
		List<LogisticaDTO> dto = new ArrayList<>();
		
		Iterable<Logistica> logisticas = this.logisticRepository.findAll();
		
		for (Logistica logistica : logisticas) {
			
			LogisticaDTO logisticaDTO = MHelpers.modelMapper().map(logistica, LogisticaDTO.class);
		
			dto.add(logisticaDTO);
		}
		
		return dto;
	}

	@Override
	public LogisticaDTO findByLogisticId(int logisticaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(LogisticaRequest logistica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(LogisticaRequest logistica, int logisticaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<LogisticaRequest> logistica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int logisticaId) {
		// TODO Auto-generated method stub
		
	}

	private LogisticaDTO convertToLogisticaDTO(final Logistica logistica) {
		return MHelpers.modelMapper().map(logistica, LogisticaDTO.class);
	}
}