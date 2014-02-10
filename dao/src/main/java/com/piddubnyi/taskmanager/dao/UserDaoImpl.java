package com.piddubnyi.taskmanager.dao;

import org.springframework.stereotype.Repository;

import com.piddubnyi.taskmanager.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public User find(String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setPassword("123");
		return user ;
	}

}
