package com.shoppingcart.shoppingcartservice.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfig {

	@Value("${activemq-broker-url}")
	public String brokerURL;

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("addProduct-queue");
	}

	/*
	 * @Bean public Queue queue() { return new ActiveMQQueue("addProduct-queue"); }
	 * 
	 *//**
		 * @return factory Object
		 */
	/*
	 * @Bean public ActiveMQConnectionFactory connectionFactory() {
	 * ActiveMQConnectionFactory connectionFactory = new
	 * ActiveMQConnectionFactory(); connectionFactory.setBrokerURL(brokerURL);
	 * return connectionFactory; }
	 * 
	 *//**
		 * @return jmsTemplate
		 *//*
			 * @Bean public JmsTemplate jmsTemplate() {
			 * 
			 * return new JmsTemplate(connectionFactory()); }
			 */
}
