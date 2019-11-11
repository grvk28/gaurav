package com.gaurav.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gaurav.model.Item;
import com.gaurav.model.Items;

public class ItemsdaoImpl implements Itemsdao {
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

	public List<Items> getitembycat(int catid) {
		// TODO Auto-generated method stub
		List<Items> list;
		String sql="select * from items where cid= "+catid +" order by price";
		list=(List<Items>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Items>(Items.class));
		return list;
	}
	public void addItems(int catid, Items items) {
		// TODO Auto-generated method stub
		String sql="insert into items set name=?,cid=?,price=?";
		Object object[]= {items.getName(),catid,items.getPrice()};
		jdbcTemplate.update(sql,object);
	}
	public List<Items> admingetitembycat(int catid) {
		// TODO Auto-generated method stub
		List<Items> list;
		String sql="select * from items where cid= "+catid+"order by price";
		list=(List<Items>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Items>(Items.class));
		return list;
	}
	public void deleteItem(int itemId) {
		// TODO Auto-generated method stub
		String sql="delete from items where iid= "+itemId;
		jdbcTemplate.update(sql);
		String s="delete from cart where iid= "+itemId;
		jdbcTemplate.update(s);
	}
	

}
