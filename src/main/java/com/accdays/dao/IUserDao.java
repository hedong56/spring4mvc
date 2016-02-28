package com.accdays.dao;

import com.accdays.dto.UserDto;

public interface IUserDao {

	public UserDto findUserInfoById(long id);

}
