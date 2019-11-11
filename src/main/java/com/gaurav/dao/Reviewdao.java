package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Review;

public interface Reviewdao {
	public void addtoReview(int iid,String uid,Review Review);
	public List<Review> getReview(String uid);
	public void addquantity(int quantity,int iid,String uid,Review Review);
	public void deleteItem(int itemId,String uid);
	public float gettotal(String uid);
}
