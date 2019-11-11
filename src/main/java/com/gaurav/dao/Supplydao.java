package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Supply;

public interface Supplydao {
	public void addtoSupply(int iid,String uid,Supply Supply);
	public List<Supply> getSupply(String uid);
	public void addquantity(int quantity,int iid,String uid,Supply Supply);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}
