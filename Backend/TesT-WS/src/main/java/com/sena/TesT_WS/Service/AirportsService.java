package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Airports;
import com.sena.TesT_WS.IRepository.IAirportsRepository;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IService.IAirportsService;

@Service
public class AirportsService extends ABaseService<Airports> implements IAirportsService{

	@Autowired
	public IAirportsRepository repository;
	
	@Override
	protected IBaseRepository<Airports, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
}
