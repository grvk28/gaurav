package com.gaurav.model;

public class R_type {
	private int cid;
	private String type;
	private float price;
	private String feat;
	private int nos;
	private int available;
	private String cdate;
	private String odate;
	private int rooms;
	private String username;
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getFeat() {
		return feat;
	}
	public void setFeat(String feat) {
		this.feat = feat;
	}
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
}
