package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.E_ads;

public interface E_adsdao {
	public void addtoE_ads(int iid,String uid,E_ads E_ads);
	public List<E_ads> getE_ads(String uid);
	public void addquantity(int quantity,int iid,String uid,E_ads E_ads);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}