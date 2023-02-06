package com.global.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.global.dao.EmployeeDAOImpl;
import com.global.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAOImpl employeeDAOImpl;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String setEmployee(Model model, Employee employee) {
		model.addAttribute("employee",employee);
		employeeDAOImpl.saveEmployee(employee);
		return "Home.jsp";
	}
	
	@RequestMapping(value="/display", method=RequestMethod.POST)
	public String getEmployee(Model model, Employee employee, HttpServletRequest request ) {
		int id = Integer.parseInt(request.getParameter("t1"));
		Employee emp = employeeDAOImpl.getEmployee(id);
		model.addAttribute("employee", emp);
		return "DisplayEmployee.jsp";
	}
}
