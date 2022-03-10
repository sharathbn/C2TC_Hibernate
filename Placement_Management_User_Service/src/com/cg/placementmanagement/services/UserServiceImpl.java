package com.cg.placementmanagement.services;

import com.cg.placementmanagement.entities.User;
import com.cg.placementmanagement.repository.UserRepository;
import com.cg.placementmanagement.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	private UserRepository repo;
	

	public UserServiceImpl() {
		repo=new UserRepositoryImpl();
	}

	@Override
	public void addNewUser(User user) {
		repo.beginTransaction();
		repo.addNewUser(user);
		repo.commitTransaction();
	}

	@Override
	public void updateUser(User user) {
		repo.beginTransaction();
		repo.updateUser(user);
		repo.commitTransaction();
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}
}
	