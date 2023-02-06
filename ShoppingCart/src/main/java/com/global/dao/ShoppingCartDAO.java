package com.global.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.ui.Model;

import com.global.beans.Product;
import com.global.beans.User;

public interface ShoppingCartDAO {
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);
	public void saveUser(User user);
	public String loginUser(Model model,String emailId, String password);
	public void addProduct(Product product, Integer userId);
	public String viewProduct(Model model);
	public void addCart(String userId, String productId);
}
