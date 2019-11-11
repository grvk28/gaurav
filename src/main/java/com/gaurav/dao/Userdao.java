package com.gaurav.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.model.User;

public interface Userdao{
	@Autowired
	public void saveOrUpdate(User user);
	public void delete(String username);
	public User getUser(String username);
}