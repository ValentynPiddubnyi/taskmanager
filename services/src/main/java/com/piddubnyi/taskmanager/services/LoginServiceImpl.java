package com.piddubnyi.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piddubnyi.taskmanager.dao.UserDao;
import com.piddubnyi.taskmanager.model.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserDao userDao;

	@Override
	public boolean validateUser(String userName, String password) {
		User user = userDao.find(userName);
		if(user.getPassword().equals(password)){ 
			return true;
		}
		return false;
	}

}
