package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Aircrafts;
import com.sena.TesT_WS.IRepository.IAircraftsRepository;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IService.IAircraftsService;

@Service
public class AircraftsService extends ABaseService<Aircrafts> implements IAircraftsService{

	@Autowired
	public IAircraftsRepository repository;
	
	@Override
	protected IBaseRepository<Aircrafts, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
