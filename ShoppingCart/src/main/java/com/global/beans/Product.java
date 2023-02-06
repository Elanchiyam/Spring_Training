package com.global.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	@Column
	private String title;
	@Column
	private String catergory;
	@Column
	private String productDescription;
	@Column
	private String image;
	@Column
	private Float price;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	public Product() {
		super();
	}

	public Product(Integer productId, String title, String catergory, String productDescription, String image,
			Float price, User user) {
		super();
		this.productId = productId;
		this.title = title;
		this.catergory = catergory;
		this.productDescription = productDescription;
		this.image = image;
		this.price = price;
		this.user = user;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", title=" + title + ", catergory=" + catergory
				+ ", productDescription=" + productDescription + ", image=" + image + ", price=" + price + ", user="
				+ user + "]";
	}
}
