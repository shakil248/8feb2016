package com.sogeti.upm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.upm.dao.UserDAO;
import com.sogeti.upm.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public void createUser(User user) {
		userDAO.createUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);		
	}

	@Override
	public User getUser(String id) {
		return userDAO.getUser(id);		
	}

}
