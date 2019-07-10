package com.yueqian.personnel.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueqian.personnel.domain.UserInfo;
import com.yueqian.personnel.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	public String login(UserInfo info) {
		UserInfo userInfo = userService.findInfoByAccount(info.getAccount());
		if (userInfo == null) {
			// �û������ڣ�
			return "login";
		} else {
			if (userInfo.getPwd().equals(info.getPwd())) {
				// �߼���ͼ��
				return "main";
			} else {
				// ���벻��ȷ
				return "login";
			}
		}
	}
}
