package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entities.User;
import com.cg.placementmanagement.services.UserService;
import com.cg.placementmanagement.services.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
	 UserService service = new UserServiceImpl();
	 User user=new User();
	user.setId(23);
	user.setName("sharathghghhg");
	user.setType("shj");
	user.setPassword("sjsjkk");
	service.updateUser(user);
	
	

	
	}

}
