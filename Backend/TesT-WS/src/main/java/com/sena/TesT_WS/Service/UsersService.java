package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Users;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.IUsersRepository;
import com.sena.TesT_WS.IService.IUsersService;

@Service
public class UsersService extends ABaseService<Users> implements IUsersService{

	@Autowired
	public IUsersRepository repository;
	
	@Override
	protected IBaseRepository<Users, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
