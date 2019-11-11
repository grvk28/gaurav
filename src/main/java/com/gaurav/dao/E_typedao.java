package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.E_type;

public interface E_typedao {
	public void addtoE_type(int iid,String uid,E_type E_type);
	public List<E_type> getE_type(String uid);
	public void addquantity(int quantity,int iid,String uid,E_type E_type);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}
