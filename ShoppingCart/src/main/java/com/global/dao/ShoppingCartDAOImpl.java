package com.global.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.global.beans.Cart;
import com.global.beans.Product;
import com.global.beans.Role;
import com.global.beans.User;

@Service
@Transactional
public class ShoppingCartDAOImpl implements ShoppingCartDAO{

	private HibernateTemplate hibernateTemplate;
	

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
	}

	@Override
	public void saveUser(User user) {
		System.out.println(user.toString());
		hibernateTemplate.saveOrUpdate(user);
		Integer i = (Integer)  hibernateTemplate.save(user);
	     if(i==user.getUserId()) {
	    	 System.out.println("User added succesfully");
	     } else {
	    	 System.out.println("User is not added");
	     }
	}

	@Override
	public String loginUser(Model model,String emailId, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM User as u WHERE u.emailId='"+emailId + "' and u.password='"+password + "'");
		User user = (User)query.uniqueResult();
		model.addAttribute("user", user);
		if((user.getRole()) == Role.Customer)
			return viewProduct(model);
		else 
			return "AddProduct.jsp";
	}

	@Override
	public void addProduct(Product product, Integer userId) {
		Session session = sessionFactory.getCurrentSession();
		Query userQuery = session.createQuery("FROM User as u WHERE u.userId=' +"+ userId + "'");
		User user = (User)userQuery.uniqueResult();
		product.setUser(user);
		Integer result = (Integer)  hibernateTemplate.save(product);
	     if(result ==product.getProductId()) {
	    	 System.out.println("Product added succesfully");
	     } else {
	    	 System.out.println("Product is not added");
	     }
	}

	@Override
	public String viewProduct(Model model) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Product");
		List<Product> product = query.list();
		model.addAttribute("product",product);
		return "ViewProduct.jsp";
	}

	@Override
	public void addCart(String userId ,String productId) {
		Session session = sessionFactory.getCurrentSession();
		Query userQuery = session.createQuery("FROM User as u WHERE u.userId=' +"+ userId + "'");
		User user = (User)userQuery.uniqueResult();
		
		Query productQuery = session.createQuery("FROM Product as p WHERE p.productId=' +"+ productId + "'");
		Product product = (Product)productQuery.uniqueResult();
		
		Cart cart = new Cart();
		cart.setCustomer(user);
		cart.setProduct(product);
		
		Integer i = (Integer)  hibernateTemplate.save(cart);
	     if(i==cart.getCartId()) {
	    	 System.out.println("Product added to cart succesfully");
	     } else {
	    	 System.out.println("Cart is not added");
	     }
	}

}
