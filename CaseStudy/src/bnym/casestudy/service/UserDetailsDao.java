package bnym.casestudy.service;

import java.util.List;

import bnym.casestudy.entity.User;

public interface UserDetailsDao{
		User findUserByusername(String username);
		public List<User> getAllUsers();
		//public User getUserById(Long id);
		public boolean saveUser(User user);
		public boolean deleteUserByUsername(String username);
		public void addAdmin();
	}


