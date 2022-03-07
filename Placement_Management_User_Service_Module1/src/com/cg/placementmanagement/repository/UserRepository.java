package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.User;

public interface UserRepository {
		public abstract User addNewUser(User user);
		public abstract User updateUser(User user);
		public abstract User deleteUser(User user);
		public abstract void commitTransaction();
		public abstract void beginTransaction();
		

		}

