package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Schedules;
import com.sena.TesT_WS.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController<Schedules, ISchedulesService>{

	protected SchedulesController(ISchedulesService service) {
		super(service, "Schedules");
		// TODO Auto-generated constructor stub
	}

	
}
