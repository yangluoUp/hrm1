package com.yueqian.personnel.service;

import com.yueqian.personnel.domain.UserInfo;

public interface UserService {

	/**
	 * 根据用户账号查询用户的信息
	 * 
	 * @param account 用户账号
	 * @return 用户信息
	 * 
	 */
	UserInfo findInfoByAccount(String account);
}
