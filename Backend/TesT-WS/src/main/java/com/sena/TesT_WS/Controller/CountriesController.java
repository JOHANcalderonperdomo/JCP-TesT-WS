package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Countries;
import com.sena.TesT_WS.IService.ICountriesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController<Countries, ICountriesService>{

	protected CountriesController(ICountriesService service) {
		super(service, "Countries");
		// TODO Auto-generated constructor stub
	}

}
