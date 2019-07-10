package com.xpu.hrm.dao;

import com.xpu.hrm.bean.UserInfo;

public interface UserMapper {

	public UserInfo findByAccount(String account);
}
