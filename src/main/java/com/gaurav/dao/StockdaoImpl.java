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

import com.gaurav.dao.Reviewdao;
import com.gaurav.model.Review;
import com.gaurav.model.Stock;
import com.gaurav.model.Category;
import com.gaurav.model.Item;
import com.gaurav.model.Items;
import com.gaurav.model.User;
public class StockdaoImpl implements Stockdao{
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
	public List<Stock> getstock() {
		List<Stock> list;
		String sql="select * from stock";
		list=(List<Stock>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Stock>(Stock.class));
		return list;
	}
	public void addtostock(Stock stock) {
		String sql="insert into stock(prdate,condn,proname,ven_id,pro_id,quantity,price) values(?,?,?,?,?,?,?)";
		Object[] object= {stock.getPrdate(),stock.getCondn(),stock.getProname(),stock.getVen_id(),stock.getPro_id(),stock.getQuantity(),stock.getPrice()};
		jdbcTemplate.update(sql,object);
		
	}
	public void deletestockbyid(int id) {
		String sql="delete from stock where id=\""+id+"\"";
		jdbcTemplate.update(sql);
		
	}
	
	
}