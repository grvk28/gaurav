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

import com.gaurav.dao.R_dtsdao;
import com.gaurav.model.R_dts;
import com.gaurav.model.Category;
import com.gaurav.model.Items;
import com.gaurav.model.User;
public class R_dtsdaoImpl implements R_dtsdao{
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
	public void addtoR_dts(int iid, String uid, R_dts R_dts) {
		// TODO Auto-generated method stub
		
	}
	public List<R_dts> getR_dts(String uid) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addquantity(int quantity, int iid, String uid, R_dts R_dts) {
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
