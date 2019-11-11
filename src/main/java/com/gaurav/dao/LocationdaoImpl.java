package com.gaurav.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gaurav.model.BLocation;
import com.gaurav.model.Cart;
import com.gaurav.model.Event;
import com.gaurav.model.GetOrder;
import com.gaurav.model.Items;
import com.gaurav.model.Location;
import com.gaurav.model.Order;

public class LocationdaoImpl implements Locationdao {
	@Autowired
	DataSource datasource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Location> getallloc() {
		// TODO Auto-generated method stub
		List<Location> list;
		String sql="select * from location order by lname";
		list=(List<Location>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Location>(Location.class));
		return list;
	}
	public List<Location> getlocbydate(String bdate) {
		// TODO Auto-generated method stub
		List<Location> list;
		String sql="select * from location where lid not in (select lid from booked_location where bdate= '"+bdate+"')";
		list=(List<Location>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Location>(Location.class));
		return list;
	}
	public void book(int lid, String uid, Cart cart, String bdate) {
		String s="select * from cart where uid='"+uid+"'and lid='"+lid+"'";
		if(jdbcTemplate.query(s, new ResultSetExtractor<Cart>() {
			public Cart extractData(ResultSet rs) throws SQLException
			{
				if(rs.next())
				{
					Cart cart=new Cart();
					return cart;
				}
				return null;
			}
		})==null)
		{
			String sql="insert into cart set uid=?,lid=?";
			Object object[]= {uid,lid};
			jdbcTemplate.update(sql,object);
		}
		
	}
	public List<Event> addevent() {
		// TODO Auto-generated method stub
		
		List<Event> list;
		String sql="select * from events";
		list=(List<Event>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Event>(Event.class));
		return list;
	}
	public void booklocation(String uid, int lid, String bdate, String event) {
		// TODO Auto-generated method stub
		String sql="insert into booked_location set uid=?,lid=?,bdate=?,event=?";
		Object object[]= {uid,lid,bdate,event};
		jdbcTemplate.update(sql,object);
	}
	public List<BLocation> getlocbyuser(String uid) {
		// TODO Auto-generated method stub
		List<BLocation> list;
		String sql="select * from booked_location,location where uid='"+uid+"'";
		list=(List<BLocation>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<BLocation>(BLocation.class));
		return list;
	}
	public void placeorder(String uid,int bid) {
		// TODO Auto-generated method stub
		String sql="insert into orders set bid=?,uid=?";
		Object object[]= {bid,uid};
		jdbcTemplate.update(sql,object);
		
	}
	public void placeitem(int iid, int quantity, float tprice, int bid) {
		// TODO Auto-generated method stub
		String p = "select cid from orders where bid="+bid;
		//float p= Float.parseFloat(s);
		int cid=jdbcTemplate.query(p, new ResultSetExtractor<Order>() {
			public Order extractData(ResultSet rs) throws SQLException
			{
				if(rs.next())
				{
					Order it=new Order();
					it.setCid(rs.getInt("cid"));
					return it;
				}
				return null;
			}
		}).getCid();
		String sql="insert into order_items set cid=?,iid=?,quantity=?,tprice=?";
		Object object[]= {cid,iid,quantity,tprice};
		jdbcTemplate.update(sql,object);
	}
	public List<Order> getorder(String uid) {
		// TODO Auto-generated method stub
		List<Order> list;
		String sql="select * from orders where uid='"+uid+"'";
		list=(List<Order>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Order>(Order.class));
		return list;
	}
	public List<GetOrder> getorder2(int bid,int cid){
		List<GetOrder> list;
		String sql="select * from items,location,booked_location,order_items where bid="+bid+" and order_items.cid="+cid+" and order_items.iid=items.iid and booked_location.lid=location.lid";
		list=(List<GetOrder>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<GetOrder>(GetOrder.class));
		return list;
	}
	public List<Order> getadminorder() {
		// TODO Auto-generated method stub
		List<Order> list;
		String sql="select * from orders";
		list=(List<Order>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Order>(Order.class));
		return list;
	}
	public List<Location> getadminlocation() {
		List<Location> list;
		String sql="select * from location";
		list=(List<Location>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Location>(Location.class));
		return list;
	}
	public void addloc(Location location) {
		// TODO Auto-generated method stub
		String sql="insert into location set lname=?,address=?,price=?";
		Object[] object= {location.getLname(),location.getAddress(),location.getPrice()};
		jdbcTemplate.update(sql,object);
	}

}
