package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.R_dts;

public interface R_dtsdao {
	public void addtoR_dts(int iid,String uid,R_dts R_dts);
	public List<R_dts> getR_dts(String uid);
	public void addquantity(int quantity,int iid,String uid,R_dts R_dts);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}
