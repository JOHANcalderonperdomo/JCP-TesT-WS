package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.CabinTypes;
import com.sena.TesT_WS.IService.ICabinTypesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabintypes")
public class CabinTypesController extends ABaseController<CabinTypes, ICabinTypesService>{

	protected CabinTypesController(ICabinTypesService service) {
		super(service, "CabinTypes");
		// TODO Auto-generated constructor stub
	}

}
