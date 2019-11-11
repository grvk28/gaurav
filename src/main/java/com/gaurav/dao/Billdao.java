package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Bill;

public interface Billdao {
	public void addtoBill(int iid,String uid,Bill Bill);
	public List<Bill> getBill(String uid);
	public void addquantity(int quantity,int iid,String uid,Bill Bill);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}