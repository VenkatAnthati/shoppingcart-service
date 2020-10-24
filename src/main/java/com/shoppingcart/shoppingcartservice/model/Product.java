package com.shoppingcart.shoppingcartservice.model;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private String productName;
	private Long productId;
	private double price;
	
	
	
	/**
	 * @param productName
	 * @param id
	 * @param price
	 */
	public Product(String productName, Long id, double price) {
		super();
		this.productName = productName;
		this.productId = id;
		this.price = price;
	}
	/**
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return productId
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * @param productId
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
	}



}
