package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Customer;
import com.gaurav.model.Employee;

public interface Employeedao {
	public void addtoemp(Employee Employee);
	public void fireemployee(int empid,String role);
	public List<Employee> getemployee();
	public List<Employee> getemployee1();
	public void deleteempbyid(int id);
}
