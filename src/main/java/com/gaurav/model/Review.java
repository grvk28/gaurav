package com.gaurav.model;

public class Review {
	private int cid;
	private int roomno;
	private String category;
	private String Reserv_id;
	private int rating;
	private String details;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getReserv_id() {
		return Reserv_id;
	}
	public void setReserv_id(String reserv_id) {
		Reserv_id = reserv_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
