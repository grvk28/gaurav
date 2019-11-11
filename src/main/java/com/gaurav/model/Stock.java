package com.gaurav.model;

public class Stock {
	private int id;
	private int pro_id;
	private String prdate;
	private String condn;
	private String proname;
	private int ven_id;
	private int quantity;
	private int price;

	
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPrdate() {
		return prdate;
	}
	public void setPrdate(String prdate) {
		this.prdate = prdate;
	}
	public String getCondn() {
		return condn;
	}
	public void setCondn(String condn) {
		this.condn = condn;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVen_id() {
		return ven_id;
	}
	public void setVen_id(int ven_id) {
		this.ven_id = ven_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
