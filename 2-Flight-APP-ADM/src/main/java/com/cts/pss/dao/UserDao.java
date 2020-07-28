package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.User;

public interface UserDao extends JpaRepository<User, String> {


	 User findByUserNameAndPassword(String userName, String password);
}
