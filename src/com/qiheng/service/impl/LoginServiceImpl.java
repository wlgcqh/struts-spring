package com.qiheng.service.impl;

import com.qiheng.service.LoginService;

public class LoginServiceImpl implements LoginService {

	public boolean isLogin(String username, String password) {
		if ("hello".equals(username) && "world".equals(password)) {
			return true;
		}
		return false;
	}

}
