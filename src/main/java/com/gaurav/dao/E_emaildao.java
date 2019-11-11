package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.E_email;

public interface E_emaildao {
	public void addtoE_email(int iid,String uid,E_email E_email);
	public List<E_email> getE_email(String uid);
	public void addquantity(int quantity,int iid,String uid,E_email E_email);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}
