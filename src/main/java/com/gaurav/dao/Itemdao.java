package com.gaurav.dao;
import java.util.List;

import com.gaurav.model.Item;
public interface Itemdao {
	public Item getItem(int itemId);
	public void deleteItem(int  itemId);
	public void addItem(Item item);
	public List<Item> getAllItems();
}
