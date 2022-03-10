package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.Admin;


public interface AdminRepository {
	public abstract Admin addNewAdmin(Admin admin);
	public abstract Admin updateAdmin(Admin admin);
	public abstract void searchAdmin(int id);
	public abstract void deleteCertificate(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
