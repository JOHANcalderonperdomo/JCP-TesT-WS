package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Roles;
import com.sena.TesT_WS.IService.IRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController<Roles, IRolesService>{

	protected RolesController(IRolesService service) {
		super(service, "Roles");
		// TODO Auto-generated constructor stub
	}

	
}
