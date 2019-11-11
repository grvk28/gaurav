package com.gaurav.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gaurav.model.Employee;
import com.gaurav.model.R_type;
public class EmployeedaoImpl implements Employeedao {
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
	public void addtoemployee(int empid,String role)
	{
		String p = "select price from items where iid="+empid;
		
	}
	
		// TODO Auto-generated method stub
		
		

	public List<Employee> getemployee() {
		List<Employee>list1;
		String sql=" select * from employee";
		
		list1=(List<Employee>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
		return list1;
	}
	public List<Employee> getemployee1() {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteempbyid(int id) {
		// TODO Auto-generated method stub
		String sql="delete from employee where empid="+id+"";
		jdbcTemplate.update(sql);
	}
	public void fireemployee(int empid, String role) {
		// TODO Auto-generated method stub
		
	}
	public void addtoemp(Employee Employee) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO employee(role,name,dob,age) VALUES (?,?,?,?)";
		 jdbcTemplate.update(sql,new Object[] {Employee.getRole(),Employee.getName(),Employee.getDob(),Employee.getAge()});
	}
	
}
