package org.josem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.josem.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDAOImpl() {

	}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	@Transactional
	public List<User> list() {
		String hql = "FROM User ORDERBY USER_ID";
		return (List<User>) entityManager.createQuery(hql).getResultList();

	}

	@Override
	public void add(User user) {
		entityManager.merge(user);

	}

	public void update(User user) {
		User usuario = getUserById(user.getId());
		usuario.setUsername(user.getUsername());
		usuario.setEmail(user.getEmail());
		usuario.setPassword(user.getPassword());
		entityManager.flush();

	}

	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getUserById(id));
	}

	@Override
	@Transactional
	public User get(int id) {
		return entityManager.find(User.class, id);

	}

}
