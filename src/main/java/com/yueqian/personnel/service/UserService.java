package com.yueqian.personnel.service;

import com.yueqian.personnel.domain.UserInfo;

public interface UserService {

	/**
	 * �����û��˺Ų�ѯ�û�����Ϣ
	 * 
	 * @param account �û��˺�
	 * @return �û���Ϣ
	 * 
	 */
	UserInfo findInfoByAccount(String account);
}
