package com.sogeti.upm.dao;

import org.springframework.stereotype.Repository;

import com.sogeti.upm.model.Address;
import com.sogeti.upm.model.User;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void createUser(User user) {
		persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		update(user);
		
	}

	@Override
	public User getUser(String id) {
		return get(User.class, id);		
	}

}
