package com.global.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User  customer;

	
	
	public Cart() {
		super();
	}

	public Cart(Integer cartId, Product product, User customer) {
		super();
		this.cartId = cartId;
		this.product = product;
		this.customer = customer;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", product=" + product + ", customer=" + customer + "]";
	}

}
