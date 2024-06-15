package com.sena.TesT_WS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Routes;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.IRoutesRepository;
import com.sena.TesT_WS.IService.IRoutesService;

@Service
public class RoutesService extends ABaseService<Routes> implements IRoutesService{

	@Autowired
	public IRoutesRepository repository;
	
	@Override
	protected IBaseRepository<Routes, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Override
	public List<Routes> findByDepartureairportContainingIgnoreCase(String departureairport) {
		// TODO Auto-generated method stub
		return repository.findByDepartureairportContainingIgnoreCase(departureairport);
	}

	@Override
	public List<Routes> findByArrivalairportContainingIgnoreCase(String arrivalairport) {
		// TODO Auto-generated method stub
		return repository.findByArrivalairportContainingIgnoreCase(arrivalairport);
	}

	
	
}
