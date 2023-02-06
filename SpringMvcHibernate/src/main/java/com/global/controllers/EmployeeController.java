package com.global.controllers;

import javax.servlet.http.HttpServletRequest;     

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.global.beans.Employee;
import com.global.dao.EmployeeDaoImp;

@Controller
//@RequestMapping(path="/emp")
public class EmployeeController {
    @Autowired
	EmployeeDaoImp employeeDaoImp;
    
	 @RequestMapping(value="/save",method=RequestMethod.POST)
	 public String setEmployee(Model model,Employee employee)
	 {
		 model.addAttribute("employee", employee);
		 employeeDaoImp.saveEmployee(employee);
		 return "Home.jsp";
	 }
	 @RequestMapping(value="/display",method=RequestMethod.POST)
	 public String getEmployee(Model model,Employee employee,
			 HttpServletRequest request)
	 {
		 
		 int id = Integer.parseInt(request.getParameter("t1"));
		 
		 Employee emp = employeeDaoImp.getEmployee(id);
		 model.addAttribute("employee", emp);
		 return "DisplayEmployee.jsp";
	 }
	
}
