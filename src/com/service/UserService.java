package com.service;

import java.util.List;

import com.dao.UserDao;
import com.model.Orders;
import com.model.Vipuser;

public class UserService {
	UserDao userDao = new UserDao();
	public Vipuser findUserById(Integer userid) throws Exception {
		return userDao.findUserById(userid);
	}
	public List<Orders> findOrdersByUserid(Integer id) throws Exception {
		return userDao.findOrdersByUserid(id);
	}
	
}
