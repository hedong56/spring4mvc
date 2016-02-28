package com.accdays.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.accdays.dao.IUserDao;
import com.accdays.dto.UserDto;

@Repository
public class UserDaoImpl implements IUserDao {
	
	private final String namespace="com.accdays.dto.UserDto.";

	@Resource
    protected SqlSession sqlSessionTemplate;

	@Override
	public UserDto findUserInfoById(long id) {
		return sqlSessionTemplate.selectOne(namespace+"findUserInfoById", id);
	} 
}
