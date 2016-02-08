package com.sogeti.upm.service;

import com.sogeti.upm.dto.UserDetailDto;
import com.sogeti.upm.model.User;

public interface UserService {
	
	public void createUser(User user);
	public void updateUser(UserDetailDto userDetailDto);
	public User getUser(String id);

}
