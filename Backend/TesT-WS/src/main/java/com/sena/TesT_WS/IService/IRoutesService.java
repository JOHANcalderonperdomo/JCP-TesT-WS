package com.sena.TesT_WS.IService;



import java.util.List;

import com.sena.TesT_WS.Entity.Routes;

public interface IRoutesService extends IBaseService<Routes>{

	 List<Routes> findByDepartureairportContainingIgnoreCase(String departureairport);
	 List<Routes> findByArrivalairportContainingIgnoreCase(String arrivalairport);
}
