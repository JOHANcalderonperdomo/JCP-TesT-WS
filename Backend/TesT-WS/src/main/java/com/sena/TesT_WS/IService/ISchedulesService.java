package com.sena.TesT_WS.IService;

import java.sql.Date;
import java.util.List;

import com.sena.TesT_WS.Entity.Schedules;

public interface ISchedulesService extends IBaseService<Schedules>{

	List<Schedules> findByDate(Date date);
}
