package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Roles;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.IRolesRepository;
import com.sena.TesT_WS.IService.IRolesService;

@Service
public class RolesService extends ABaseService<Roles> implements IRolesService{

	@Autowired
	public IRolesRepository repository;
	
	@Override
	protected IBaseRepository<Roles, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
