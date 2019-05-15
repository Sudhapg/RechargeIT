package bnym.casestudy.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entity.Authorities;
import bnym.casestudy.entity.User;
import bnym.casestudy.repository.UserRegRepository;

@Repository
public class UserDetailsDaoImp implements UserDetailsDao  {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	UserRegRepository repository;

	@Override
	public User findUserByusername(String username) {
		return sessionFactory.getCurrentSession().get(User.class, username);

	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		try {
			repository.save(user);
			return true;
		}catch(Exception ex) {
		return false;
		}

	}

	@Override
	public void addAdmin() {
		User admin = new User();
		admin.setUsername("sudha");
		String encode = new BCryptPasswordEncoder().encode("123456");
		admin.setPassword(encode);
		admin.setEnabled(true);
		admin.setCvc(456);
		Authorities adminAuth = new Authorities();
		adminAuth.setAuthority("ROLE_ADMIN");
		adminAuth.setUser(admin);
		admin.getAuthorities().add(adminAuth);
		System.out.println("Before repo query: "+admin.getUsername());
		Boolean userExists = repository.existsById(admin.getUsername());
		try {
			if (!userExists) {
				repository.save(admin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside delete method");
			repository.deleteById(username);
			return true;
		}catch(Exception ex) {
		return false;
		}
		
	}
	
	

}
