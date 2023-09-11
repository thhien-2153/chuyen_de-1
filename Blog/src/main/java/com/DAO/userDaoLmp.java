package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.users;

public class userDaoLmp implements userDao{
	private Connection conn;
	
	public userDaoLmp(Connection conn) {
		super();
		this.conn = conn;
		
	}

	
	public boolean userRegister(users us) {
		boolean f=false;
		
		try {
			String sql ="insert into users(name,email,phoneNum,password) values(?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhoneNum());
			ps.setString(4, us.getPassword());
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return f;
	}

}
