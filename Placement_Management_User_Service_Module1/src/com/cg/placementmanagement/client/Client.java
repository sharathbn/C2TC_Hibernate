package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entities.User;
import com.cg.placementmanagement.services.UserService;
import com.cg.placementmanagement.services.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
	 UserService service = new UserServiceImpl();
	 User user=new User();
	user.setId(2);
	user.setName("sharathbn");
	user.setType("jdkfskj");
	user.setPassword("jsdjsdsdj");
	service.updateUser(user);
	System.out.println("completed successfully");
	
	}

}
