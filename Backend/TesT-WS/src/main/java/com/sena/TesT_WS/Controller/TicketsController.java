package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Tickets;
import com.sena.TesT_WS.IService.ITiketsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController<Tickets, ITiketsService>{

	protected TicketsController(ITiketsService service) {
		super(service, "Tickets");
		// TODO Auto-generated constructor stub
	}

	
}
