package com.sena.TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.TesT_WS.Entity.Users;
import com.sena.TesT_WS.IService.IUsersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/users")
public class UsersController extends ABaseController<Users, IUsersService>{

	protected UsersController(IUsersService service) {
		super(service, "Users");
		// TODO Auto-generated constructor stub
	}

	
}
