package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Offices;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.IOfficesRepository;
import com.sena.TesT_WS.IService.IOfficeService;

@Service
public class OfficeService extends ABaseService<Offices> implements IOfficeService{

	@Autowired
	public IOfficesRepository repository;
	
	@Override
	protected IBaseRepository<Offices, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
