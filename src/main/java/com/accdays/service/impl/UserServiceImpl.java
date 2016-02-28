package com.accdays.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accdays.dao.IUserDao;
import com.accdays.dto.UserDto;
import com.accdays.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public UserDto queryUser(long id) {
		return userDao.findUserInfoById(id);
	}
	
}
