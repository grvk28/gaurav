package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Category;
import com.gaurav.model.Location;
import com.gaurav.model.User;

public interface Categorydao {
	public List<Category> getallcat();
	public void addCat(Category category);
	public List<User> getallusers();
}
