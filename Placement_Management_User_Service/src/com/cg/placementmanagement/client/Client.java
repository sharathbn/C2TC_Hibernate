package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entities.Admin;
import com.cg.placementmanagement.entities.User;
import com.cg.placementmanagement.services.UserService;
import com.cg.placementmanagement.services.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
	 
		
		
		Admin admin =new Admin();
		admin.setName("intekhab");
		admin.setPassword("jkhsdkjhfgsdsh");
		
	 User user=new User();
     user.setName("sharathbn");
	user.setType("jdkfskj");
	user.setPassword("jsdjsdsdj");

	
	
	user.setAdmin(admin);
	admin.setUser(user);
	
	
	UserService service=new UserServiceImpl();
	service.addNewUser(user);
	
	
	}

}
