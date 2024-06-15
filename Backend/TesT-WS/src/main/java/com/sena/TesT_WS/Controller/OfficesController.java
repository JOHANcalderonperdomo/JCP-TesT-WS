package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Offices;
import com.sena.TesT_WS.IService.IOfficeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/offices")
public class OfficesController extends ABaseController<Offices, IOfficeService>{

	protected OfficesController(IOfficeService service) {
		super(service, "Offices");
		// TODO Auto-generated constructor stub
	}

}
