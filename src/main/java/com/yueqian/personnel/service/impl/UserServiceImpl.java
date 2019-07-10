package com.yueqian.personnel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueqian.personnel.dao.UserMapper;
import com.yueqian.personnel.domain.UserInfo;
import com.yueqian.personnel.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public UserInfo findInfoByAccount(String account) {
		UserInfo userInfo=userMapper.findByAccount(account);
		return userInfo;
	}

}
