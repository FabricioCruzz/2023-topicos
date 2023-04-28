package br.edu.univas.si7.topicos.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univas.si7.topicos.order.entity.OrderEntity;
import br.edu.univas.si7.topicos.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public List<OrderEntity> getAllOrders() {
		return service.findAll();
	}
}
