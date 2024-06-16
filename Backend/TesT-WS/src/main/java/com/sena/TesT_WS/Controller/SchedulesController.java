package com.sena.TesT_WS.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Schedules;
import com.sena.TesT_WS.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController<Schedules, ISchedulesService>{

	@Autowired
	private ISchedulesService scheduleService;
	protected SchedulesController(ISchedulesService service) {
		super(service, "Schedules");
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/fechaSalida")
    public List<Schedules> findByDate(@RequestParam Date date) {
        return scheduleService.findByDate(date);
	}
	
}
