package com.ejemplos.spring.dao;

import java.util.List;

//deprecated
//import org.hibernate.Criteria;
//deprecated
//import org.hibernate.Query;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//new para evitar Deprecated Criteria
import javax.persistence.criteria.CriteriaBuilder;
//new para evitar Deprecated Criteria
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.*;

import com.ejemplos.spring.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl() {
		
	}
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<User> list() {
		
		//Deprecated 
		//@SuppressWarnings("unchecked")
		//List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
				//.createCriteria(User.class)
				//.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		//return listUser;
				
		// Create CriteriaBuilder (Desde Hb 5.2 si uso Criteria)
		// https://www.boraji.com/hibernate-5-criteria-query-example
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> root = query.from(User.class);
		query.select(root);
		Query<User> q=sessionFactory.getCurrentSession().createQuery(query);
		List<User> listUser = q.getResultList();
		
		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		User userToDelete = new User();
		userToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public User get(int id) {
		String hql = "from User where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
}