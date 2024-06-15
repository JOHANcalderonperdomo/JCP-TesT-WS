package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Airports;
import com.sena.TesT_WS.IService.IAirportsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController<Airports, IAirportsService>{

	protected AirportsController(IAirportsService service) {
		super(service, "Airports");
		// TODO Auto-generated constructor stub
	}

	
}
