package com.shoppingcart.shoppingcartservice.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoppingcart.shoppingcartservice.model.Product;
import com.shoppingcart.shoppingcartservice.proxy.ProductServiceProxy;

@RestController
public class ShoppingcartController {

	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	ProductServiceProxy proxy;

	@Autowired
	Queue queue;

	/** 
	 * This method push object into Queue.
	 * @param productId
	 * @return String
	 */
	@GetMapping("/addProduct/{productId}")
	public String addProductToQueue(@PathVariable Long productId) {

		Product product = proxy.getProductById(productId);

		System.out.println("pushing Product into queue");

		//Product prod = newprod.get();

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String productJson = objectMapper.writeValueAsString(product);
			jmsTemplate.convertAndSend(queue, productJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// jmsTemplate.convertAndSend(queue, prod);
		return "Product send Succussfully";
	}

}
