package com.global.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.global.model.Employee;
import com.global.model.EmployeeMapper;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {


	JdbcTemplate jdbcTemplate;  
	
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public int saveEmployee(Employee e) {
		// TODO Auto-generated method stub
//		int result = jdbcTemplate.update("insert into employee (id,name,salary) "
//				+ "values(?,?,?)",e.getId(),e.getName(),e.getSalary());
//		return result;
		System.out.println("Inside method");
		String query="insert into employee values('" + e.getId()+ "','" + e.getName()+ "','" + e.getSalary() +"')";  
		int res = jdbcTemplate.update(query);
		System.out.println("Res");
		return res;
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
	    String query="update employee set salary=? where id=?";
	    
		return jdbcTemplate.update(query,e.getSalary(), e.getId());
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		String query = "delete from employee where id= ?";
		return jdbcTemplate.update(query,id);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from employee where id = ?";
		Object[] values = {id};
		return jdbcTemplate.queryForObject(sql, values,new EmployeeMapper());
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());
	}
	

}
