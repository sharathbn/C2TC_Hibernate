package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.placementmanagement.entities.Admin;


public class AdminRepositoryImpl implements AdminRepository{
private EntityManager entityManager;
	


	public AdminRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
}

	@Override
	public Admin addNewAdmin(Admin admin) {
		entityManager.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return entityManager.merge(admin);
	}

	@Override
	public void searchAdmin(int id) {
		entityManager.find(Admin.class, id);
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void deleteCertificate(int id) {
		Admin admin=entityManager.find(Admin.class, id);
		entityManager.remove(admin);
		
	}
}
