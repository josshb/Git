package com.ejemplos.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.dao.UserDAO;
import com.ejemplos.spring.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	/*
	public UserServiceImpl(){
		
	}
	
	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	*/


	public List<User> list() {

		return userDAO.list();
	}

	public User get(int id) {
		return userDAO.get(id);
	}

	public void saveOrUpdate(User user) {
		userDAO.saveOrUpdate(user);

	}

	public void delete(int id) {
		userDAO.delete(id);

	}

}
