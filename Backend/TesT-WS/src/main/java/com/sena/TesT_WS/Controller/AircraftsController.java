package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Aircrafts;
import com.sena.TesT_WS.IService.IAircraftsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/aircrafts")
public class AircraftsController extends ABaseController<Aircrafts, IAircraftsService>{

	protected AircraftsController(IAircraftsService service) {
		super(service, "Aircrafts");
		// TODO Auto-generated constructor stub
	}

}
