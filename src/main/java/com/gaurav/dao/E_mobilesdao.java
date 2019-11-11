package com.gaurav.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.model.E_mobiles;

public interface E_mobilesdao{
	@Autowired
	public void saveOrUpdate(E_mobiles E_mobile);
	public void delete(String E_mobilename);
	public E_mobiles getE_mobile(String E_mobilename);
}
