package com.infogain.serviceIMPL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.entity.Login;
import com.infogain.repository.LoginRepository;
import com.infogain.service.LoginService;

@Service
public class LoginServiceIMPL implements LoginService{

	@Autowired
	LoginRepository repo;
	
	@Override
	public Login saveUser(Login login) {
		// TODO Auto-generated method stub
		repo.save(login);
		return login;
	}

	@Override
	public List<Login> getUserDetail() {
		// TODO Auto-generated method stub
		Iterator<Login> itr = repo.findAll().iterator();
		List<Login> list = new ArrayList<Login>();
		while(itr.hasNext()) {
			Login login = itr.next();
			list.add(login);
		}
		return list;
	}

	@Override
	public String deleteUser(Login login) {
		// TODO Auto-generated method stub
		repo.delete(login);
		return "records deleted";
	}

	@Override
	public Login saveOrUpdateUser(Login login) {
		// TODO Auto-generated method stub
		repo.save(login);
		return login;
	}

}
