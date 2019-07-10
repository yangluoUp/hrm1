package com.xpu.hrm.service.impl;

import javax.annotation.Resource;

import com.xpu.hrm.bean.UserInfoExample;
import com.xpu.hrm.dao.UserInfoMapper;
import org.springframework.stereotype.Service;

import com.xpu.hrm.dao.UserMapper;
import com.xpu.hrm.bean.UserInfo;
import com.xpu.hrm.service.UserService;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserInfoMapper userInfoMapper;


	@Override
	public UserInfo getUserByNameAndPwd(String username,String password) {
		UserInfoExample example = new UserInfoExample();
		UserInfoExample.Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(username);
		criteria.andUserPasswordEqualTo(password);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		if (userInfos.size()>1){
			return null;
		}else{
			return (UserInfo) userInfos.get(0);
		}
	}

	@Override
	public UserInfo getUserByName(String name) {
		UserInfoExample example = new UserInfoExample();
		UserInfoExample.Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(name);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		if(userInfos!=null){
			return (UserInfo) userInfos.get(0);
		}else{
			return null;
		}
	}
}
