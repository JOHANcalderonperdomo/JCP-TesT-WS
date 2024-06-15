package com.sena.TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Tickets;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.ITiketsRepository;
import com.sena.TesT_WS.IService.ITiketsService;

@Service
public class TicketsService extends ABaseService<Tickets> implements ITiketsService{

	@Autowired
	public ITiketsRepository repository;
	
	@Override
	protected IBaseRepository<Tickets, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
}
