package br.edu.univas.si7.topicos.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univas.si7.topicos.order.entity.OrderEntity;
import br.edu.univas.si7.topicos.order.repository.OrderMongoRepository;

@Service
public class OrderService {

	private OrderMongoRepository repo;

	@Autowired
	public OrderService(OrderMongoRepository repo) {
		this.repo = repo;
	}

	public List<OrderEntity> findAll() {
		return repo.findAll();
	}
}
