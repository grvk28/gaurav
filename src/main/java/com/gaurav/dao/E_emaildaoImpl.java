package com.gaurav.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gaurav.dao.E_emaildao;
import com.gaurav.model.E_email;
import com.gaurav.model.Category;
import com.gaurav.model.Items;
import com.gaurav.model.User;
public class E_emaildaoImpl implements E_emaildao{
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
	public void addtoE_email(int iid, String uid, E_email E_email) {
		// TODO Auto-generated method stub
		
	}
	public List<E_email> getE_email(String uid) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addquantity(int quantity, int iid, String uid, E_email E_email) {
		// TODO Auto-generated method stub
		
	}
	public void deleteItem(int itemId, String uid) {
		// TODO Auto-generated method stub
		
	}
	public float gettotal(String uid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
