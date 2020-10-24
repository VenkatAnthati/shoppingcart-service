package com.shoppingcart.shoppingcartservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shoppingcart.shoppingcartservice.model.Product;


@FeignClient(name="product-service")
@RibbonClient(name="product-service")
public interface ProductServiceProxy {

	
	/**
	 * This method is call product service using FeignClient.
	 * @param id
	 * @return Product
	 */
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Long id);
}
