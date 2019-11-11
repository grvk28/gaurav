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

import com.gaurav.dao.E_adsdao;
import com.gaurav.model.E_ads;
import com.gaurav.model.Category;
import com.gaurav.model.Items;
import com.gaurav.model.User;
public class E_adsdaoImpl implements E_adsdao{
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
	public void addtoE_ads(int iid, String uid, E_ads E_ads) {
		// TODO Auto-generated method stub
		
	}
	public List<E_ads> getE_ads(String uid) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addquantity(int quantity, int iid, String uid, E_ads E_ads) {
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
