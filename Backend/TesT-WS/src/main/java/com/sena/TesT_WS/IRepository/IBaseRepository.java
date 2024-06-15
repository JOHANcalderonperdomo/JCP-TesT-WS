package com.sena.TesT_WS.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.TesT_WS.Entity.AbaseEntity;

public interface IBaseRepository<T extends AbaseEntity, ID> extends JpaRepository<T, Long> {
	
}
 


