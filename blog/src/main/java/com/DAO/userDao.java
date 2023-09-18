package com.DAO;

import com.entity.users;

public interface userDao {
	public boolean userRegister(users us) ;
	
	public users login(String email, String password);
}