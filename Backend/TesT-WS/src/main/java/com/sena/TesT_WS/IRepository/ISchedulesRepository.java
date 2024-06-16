package com.sena.TesT_WS.IRepository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.TesT_WS.Entity.Schedules;

@Repository
public interface ISchedulesRepository extends IBaseRepository<Schedules, Long>{

	@Query("SELECT s FROM Schedules s WHERE s.date = :date")
    List<Schedules> findByDate(@Param("date") Date date);
}
