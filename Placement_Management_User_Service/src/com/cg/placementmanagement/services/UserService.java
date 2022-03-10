package com.cg.placementmanagement.services;

import com.cg.placementmanagement.entities.User;

public interface UserService {
	public void addNewUser(User user);
	public void updateUser(User user);
	public void login(User user);
	public boolean logOut();
	
}