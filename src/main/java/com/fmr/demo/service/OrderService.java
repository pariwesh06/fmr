package com.fmr.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmr.demo.repository.IOrderRepository;

@Service
public class OrderService {
	@Autowired
	private IOrderRepository orderRepository;

	public IOrderRepository getOrderRepository() {
		return orderRepository;
	}
	
	public void save(){
		this.orderRepository.saveOrder();
	}
}
