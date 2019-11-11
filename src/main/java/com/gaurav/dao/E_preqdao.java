package com.gaurav.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.model.E_preq;

public interface E_preqdao{
	@Autowired
	public void saveOrUpdate(E_preq E_preq);
	public void delete(String E_preqname);
	public E_preq getE_preq(String E_preqname);
}
