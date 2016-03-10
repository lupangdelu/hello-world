package com.cn.safety.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.safety.dao.IUserDao;
import com.cn.safety.pojo.User;
import com.cn.safety.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
