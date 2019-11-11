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

import com.gaurav.dao.E_mobilesdao;
import com.gaurav.model.E_mobiles;
import com.gaurav.model.Category;
import com.gaurav.model.Items;
import com.gaurav.model.User;
public class E_mobilesdaoImpl implements E_mobilesdao{
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
	public void saveOrUpdate(E_mobiles E_mobile) {
		// TODO Auto-generated method stub
		
	}
	public void delete(String E_mobilename) {
		// TODO Auto-generated method stub
		
	}
	public E_mobiles getE_mobile(String E_mobilename) {
		// TODO Auto-generated method stub
		return null;
	}
	}