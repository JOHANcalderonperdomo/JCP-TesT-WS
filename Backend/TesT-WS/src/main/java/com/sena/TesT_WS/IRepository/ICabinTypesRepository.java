package com.sena.TesT_WS.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.TesT_WS.Entity.CabinTypes;

@Repository
public interface ICabinTypesRepository extends IBaseRepository<CabinTypes, Long>{

	@Query("SELECT c FROM CabinTypes c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<CabinTypes> findByNameContainingIgnoreCase(@Param("name") String name);

}
