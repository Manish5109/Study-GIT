package com.infogain.service;

import java.util.List;

import com.infogain.entity.Login;

public interface LoginService {

	public Login saveUser(Login login);
	public List<Login> getUserDetail();
	public String deleteUser(Login login);
	public Login saveOrUpdateUser(Login login);
}
