package com.ead.prueba.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.LogisticaDTO;
import com.ead.prueba.dto.LogisticaRequest;

@Service
public interface ILogisticService {

	List<LogisticaDTO> findAll();
	
	LogisticaDTO findByLogisticId(int logisticaId);
	
	void save(LogisticaRequest logistica);
	
	void update(LogisticaRequest logistica, int logisticaId);
	
	void saveAll(List<LogisticaRequest> logistica);
	
	void deleteById(int logisticaId);
}
