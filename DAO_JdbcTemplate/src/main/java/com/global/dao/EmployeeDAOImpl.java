package com.global.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.global.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;  
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		String query="insert into employee values('" + e.getId()+ "','" + e.getName()+ "','" + e.getSalary() +"')";  
		return jdbcTemplate.update(query);
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
	    String query="update employee set salary=? where id=?";
	    Object[] params = {e.getSalary(), e.getId()};
		return jdbcTemplate.update(query,params);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		String query = "delete from employee where id= '" + id + "'";
		return jdbcTemplate.update(query);
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from employee where id = ?";
		Object[] values = {id};
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
