package com.sena.TesT_WS.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.TesT_WS.Entity.Schedules;
import com.sena.TesT_WS.IRepository.IBaseRepository;
import com.sena.TesT_WS.IRepository.ISchedulesRepository;
import com.sena.TesT_WS.IService.ISchedulesService;

@Service
public class SchedulesService extends ABaseService<Schedules> implements ISchedulesService{

	@Autowired
	public ISchedulesRepository repository;
	
	@Override
	protected IBaseRepository<Schedules, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Override
	public List<Schedules> findByDate(Date date) {
		// TODO Auto-generated method stub
		return repository.findByDate(date);
	}

	
}
