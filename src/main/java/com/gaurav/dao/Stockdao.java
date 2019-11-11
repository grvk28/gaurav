package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Cart;
import com.gaurav.model.Ccart;
import com.gaurav.model.Stock;

public interface Stockdao {
	public List<Stock> getstock();
	public void addtostock(Stock stock);
	public void deletestockbyid(int id);
	
	
}
