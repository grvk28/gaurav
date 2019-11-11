package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Items;
import com.gaurav.model.R_type;
import com.gaurav.model.User;
import com.gaurav.model.Room;
import com.gaurav.model.Customer;

public interface R_typedao {
	public  List<R_type> gettypes();
	public void addR_type(int cid,R_type R_type);
	public List<R_type> admingetitembycat(String type);
	public void deleteItem(int cid);
	public List<Items> admingetitembycat(int catid);
	public List<R_type> getitembycat(int catid);
	public void saveOrUpdate(Customer Customer,int cid,String Username);
	public void decrearebyx(int rooms);
	public List<R_type>get_details(int cid,String username);
	public List<R_type>get_details1(String UserName);
	public List<R_type>getavailable(int cid);
	public int getTotal(int cid);
}
