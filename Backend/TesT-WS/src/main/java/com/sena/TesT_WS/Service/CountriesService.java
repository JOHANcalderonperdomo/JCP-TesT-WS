package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Countries;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.ICountriesRepository;
import com.sena.TesT_WS.IService.ICountriesService;

@Service
public class CountriesService extends ABaseService<Countries> implements ICountriesService{

	@Autowired
	public ICountriesRepository repository;
	
	@Override
	protected IBaseRepository<Countries, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
