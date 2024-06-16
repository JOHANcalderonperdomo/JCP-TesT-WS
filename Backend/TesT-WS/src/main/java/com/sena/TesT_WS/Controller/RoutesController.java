package com.sena.TesT_WS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Routes;
import com.sena.TesT_WS.IService.IRoutesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/routes")
public class RoutesController extends ABaseController<Routes, IRoutesService>{

	
	 @Autowired
	    private IRoutesService routesService;
	 
	protected RoutesController(IRoutesService service) {
		super(service, "Routes");
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/origen")
    public List<Routes> findByDepartureairport(@RequestParam String departureairport) {
        return routesService.findByDepartureairportContainingIgnoreCase(departureairport);
    }
	
	@GetMapping("/destino")
    public List<Routes> findByArrivalairport(@RequestParam String arrivalairport) {
        return routesService.findByDepartureairportContainingIgnoreCase(arrivalairport);
    }
}
