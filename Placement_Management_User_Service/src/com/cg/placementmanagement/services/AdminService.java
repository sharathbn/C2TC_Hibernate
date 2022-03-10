package com.cg.placementmanagement.services;

import com.cg.placementmanagement.entities.Admin;


public interface AdminService {
	public abstract void addNewAdmin(Admin admin);
	public abstract void updateAdmin(Admin admin);
	public abstract void searchAdmin(int id);
	public abstract void deleteAdmin(int id);
	

}
