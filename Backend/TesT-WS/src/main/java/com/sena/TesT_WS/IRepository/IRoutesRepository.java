package com.sena.TesT_WS.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.TesT_WS.Entity.Routes;



@Repository
public interface IRoutesRepository extends IBaseRepository<Routes, Long>{

	@Query("SELECT r FROM Routes r WHERE LOWER(r.departureairport.name) LIKE LOWER(CONCAT('%', :departureairport, '%'))")
    List<Routes> findByDepartureairportContainingIgnoreCase(@Param("departureairport") String departureairport);
	
	@Query("SELECT r FROM Routes r WHERE LOWER(r.arrivalairport.name) LIKE LOWER(CONCAT('%', :arrivalairport, '%'))")
    List<Routes> findByArrivalairportContainingIgnoreCase(@Param("arrivalairport") String arrivalairport);
}
