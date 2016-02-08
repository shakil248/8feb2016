package com.sogeti.upm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.upm.dao.UserDAO;
import com.sogeti.upm.dto.UserDetailDto;
import com.sogeti.upm.model.Address;
import com.sogeti.upm.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public void createUser(UserDetailDto userDetailDto) {
		
		User user = new User();
		Address address = new Address();
		user.setEmailId(userDetailDto.getEmailId());
		user.setPassword(userDetailDto.getPassword());
		user.setUserName(userDetailDto.getUserName());
		
		address.setCity(userDetailDto.getCity());
		address.setCountry(userDetailDto.getCountry());
		address.setHouseNo(userDetailDto.getHouseNo());
		address.setStreet(userDetailDto.getStreet());
		user.setAddress(address);
		userDAO.createUser(user);
	}

	@Override
	public void updateUser(UserDetailDto userDetailDto) {
		userDAO.updateUser(new User());		
	}

	@Override
	public User getUser(String id) {
		return userDAO.getUser(id);		
	}
}