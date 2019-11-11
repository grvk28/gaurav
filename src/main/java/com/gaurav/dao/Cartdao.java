package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Cart;
import com.gaurav.model.Ccart;

public interface Cartdao {
	public void addtocart(int iid,String uid,Cart cart);
	public List<Cart> getcart(String uid);
	public void addquantity(int quantity,int iid,String uid,Cart cart);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
	public void addtoccart(String uid,int cid, Ccart Ccart);
}
