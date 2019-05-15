package bnym.casestudy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import bnym.casestudy.entity.User;


public interface UserRegRepository extends CrudRepository<User,String> {
	
	
	User findByUsername(String username); 
	
}
