package com.sena.TesT_WS.IService;

import java.util.List;

import com.sena.TesT_WS.Entity.CabinTypes;

public interface ICabinTypesService extends IBaseService<CabinTypes>{

	List<CabinTypes> findByNameContainingIgnoreCase(String name);
}
