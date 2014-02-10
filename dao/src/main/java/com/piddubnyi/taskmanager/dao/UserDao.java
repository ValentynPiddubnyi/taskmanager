package com.piddubnyi.taskmanager.dao;

import com.piddubnyi.taskmanager.model.User;

public interface UserDao {

	User find(String userName);

}
