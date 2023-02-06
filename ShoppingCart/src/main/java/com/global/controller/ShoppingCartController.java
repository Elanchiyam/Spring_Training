package com.global.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.global.beans.Product;
import com.global.beans.User;
import com.global.dao.ShoppingCartDAOImpl;

@Controller

public class ShoppingCartController {

	@Autowired
	ShoppingCartDAOImpl shoppingCartDAOImpl;
	
	@PostMapping("/addUser")
	public String addNewUser(User user) {
		shoppingCartDAOImpl.saveUser(user);
		return "index.jsp";
	}
	
	@PostMapping("/login")
	public String loginUser(Model model,User user) {
			return shoppingCartDAOImpl.loginUser(model,user.getEmailId(), user.getPassword());
	}
	
	@PostMapping("/seller/addProduct")
	public String addProduct(Product product,@RequestParam Integer userId) {
		
		shoppingCartDAOImpl.addProduct(product, userId);
		return "redirect:/index.jsp";
	}
	
	@GetMapping("{userId}/{productId}/product")
	public void addCart(@PathVariable String productId,@PathVariable String userId) {
		shoppingCartDAOImpl.addCart(userId, productId);
	}
	
}
