package com.gaurav.model;

public class Bill {
	private String date;
	private String Resrv_id;
	private String name;
	private int type;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResrv_id() {
		return Resrv_id;
	}
	public void setResrv_id(String resrv_id) {
		Resrv_id = resrv_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
