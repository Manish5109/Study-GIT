package com.infogain.repository;

import org.springframework.data.repository.CrudRepository;

import com.infogain.entity.Login;

public interface LoginRepository extends CrudRepository<Login, Long>{

	public Login findByUserName(String userName);
}
