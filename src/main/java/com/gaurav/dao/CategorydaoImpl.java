package com.gaurav.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gaurav.model.Category;
import com.gaurav.model.Location;
import com.gaurav.model.User;

public class CategorydaoImpl implements Categorydao {
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
	public List<Category> getallcat() {
		// TODO Auto-generated method stub
		List<Category> list;
		String sql="select * from category order by cname";
		list=(List<Category>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));
		return list;
	}
	
	public void addCat(Category category) {
		// TODO Auto-generated method stub
		String sql="insert into category set cname=?";
		Object[] object= {category.getCname()};
		jdbcTemplate.update(sql,object);
	}
	public List<User> getallusers() {
		// TODO Auto-generated method stub
		List<User> list;
		String sql="select * from users order by username";
		list=(List<User>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
	}
	

}
