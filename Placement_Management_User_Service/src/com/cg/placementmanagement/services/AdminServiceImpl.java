package com.cg.placementmanagement.services;

import com.cg.placementmanagement.entities.Admin;
import com.cg.placementmanagement.repository.AdminRepository;
import com.cg.placementmanagement.repository.AdminRepositoryImpl;
import com.cg.placementmanagement.repository.UserRepository;
import com.cg.placementmanagement.repository.UserRepositoryImpl;

public class AdminServiceImpl implements AdminService {
	
private AdminRepository repo;
	

	public AdminServiceImpl() {
		repo=new AdminRepositoryImpl();
	}

	@Override
	public void addNewAdmin(Admin admin) {
		repo.beginTransaction();
		repo.addNewAdmin(admin);
		repo.commitTransaction();
	}

	@Override
	public void updateAdmin(Admin admin) {
		repo.beginTransaction();
		repo.updateAdmin(admin);
		repo.commitTransaction();
	}

	@Override
	public void searchAdmin(int id) {
		repo.beginTransaction();
		repo.searchAdmin(id);
		repo.commitTransaction();
	}    

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		
	}

}
