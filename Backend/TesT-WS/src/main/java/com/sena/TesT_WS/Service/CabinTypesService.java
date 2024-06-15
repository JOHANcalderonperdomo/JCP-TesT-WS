package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.CabinTypes;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.ICabinTypesRepository;
import com.sena.TesT_WS.IService.ICabinTypesService;

@Service
public class CabinTypesService extends ABaseService<CabinTypes> implements ICabinTypesService{

	@Autowired
	public ICabinTypesRepository repositiry;
	
	@Override
	protected IBaseRepository<CabinTypes, Long> getRepository() {
		// TODO Auto-generated method stub
		return repositiry;
	}

	
}
