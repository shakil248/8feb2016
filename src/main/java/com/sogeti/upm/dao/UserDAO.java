package com.sogeti.upm.dao;

import com.sogeti.upm.model.Address;
import com.sogeti.upm.model.User;

public interface UserDAO {

	public void createUser(User user);
	public void updateUser(User user);
	public User getUser(String id);
}
