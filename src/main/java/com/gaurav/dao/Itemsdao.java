package com.gaurav.dao;

import java.util.List;
import com.gaurav.model.Items;

public interface Itemsdao {
	public List<Items> getitembycat(int catid);
	public void addItems(int catid,Items items);
	public List<Items> admingetitembycat(int catid);
	public void deleteItem(int itemId);
	

}
