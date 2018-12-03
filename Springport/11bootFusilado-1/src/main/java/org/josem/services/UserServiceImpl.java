package org.josem.services;

import java.util.List;

import org.josem.dao.UserDAO;
import org.josem.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

}
