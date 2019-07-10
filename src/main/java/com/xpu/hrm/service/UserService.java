package com.xpu.hrm.service;

import com.xpu.hrm.bean.UserInfo;

public interface UserService {

	UserInfo getUserByNameAndPwd(String username,String password);
	UserInfo getUserByName(String name);
}
