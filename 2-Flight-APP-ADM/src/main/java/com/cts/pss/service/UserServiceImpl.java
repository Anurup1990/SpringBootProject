package com.cts.pss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.UserDao;
import com.cts.pss.entity.User;

@Service
public class UserServiceImpl {
	
	@Autowired
	UserDao userDao;

	public User searchByUserNameAndPassword(String userName, String password ) {
		
		User user = userDao.findByUserNameAndPassword(userName, password);
		
		return user;
		
	}
}
