package com.yueqian.personnel.dao;

import com.yueqian.personnel.domain.UserInfo;

public interface UserMapper {

	public UserInfo findByAccount(String account);
}
