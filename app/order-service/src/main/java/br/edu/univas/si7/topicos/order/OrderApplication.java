package br.edu.univas.si7.topicos.order;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.univas.si7.topicos.order.entity.OrderEntity;
import br.edu.univas.si7.topicos.order.repository.OrderMongoRepository;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderMongoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OrderEntity order1 = new OrderEntity(1L, LocalDateTime.now().minusHours(2));
		OrderEntity order2 = new OrderEntity(2L, LocalDateTime.now().minusDays(1));
		repo.save(order1);
		repo.save(order2);
	}
}
