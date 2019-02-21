package com.infogain.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.entity.Login;
import com.infogain.serviceIMPL.LoginServiceIMPL;

@RestController
@RequestMapping(value = "/hrms")
public class LoginController {

	@Autowired
	LoginServiceIMPL service;

	@GetMapping
	public List<Login> getAllUser() {
		return service.getUserDetail();
	}
	
	@PostMapping
	public Login saveLogin(@RequestBody Login login, HttpServletRequest request) {
		return service.saveUser(login);
	}
	
	@DeleteMapping
	public String delete(@RequestBody Login login, HttpServletRequest request) {
		return service.deleteUser(login);
	}
	
	@PatchMapping
	public Login update(@RequestBody Login login, HttpServletRequest request) {
		
		return service.saveOrUpdateUser(login);
	}

}
