package br.edu.univas.si7.topicos.order;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.univas.si7.topicos.order.entity.OrderEntity;
import br.edu.univas.si7.topicos.order.entity.SellerEntity;
import br.edu.univas.si7.topicos.order.repository.OrderMongoRepository;
import br.edu.univas.si7.topicos.order.repository.SellerMongoRepository;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderMongoRepository repo;
	
	@Autowired
	private SellerMongoRepository sellerRepo;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SellerEntity s1 = new SellerEntity("Seller 01", "seller1@email.com");
		SellerEntity s2 = new SellerEntity("Seller 02", "seller2@email.com");
		SellerEntity s3 = new SellerEntity("Seller 03", "seller2@email.com");
		
		sellerRepo.deleteAll();
		sellerRepo.saveAll(Arrays.asList(s1, s2, s3));

		OrderEntity order1 = new OrderEntity(1L, LocalDateTime.now().minusHours(2), s2);
		OrderEntity order2 = new OrderEntity(2L, LocalDateTime.now().minusDays(1), s3);
		
		repo.save(order1);
		repo.save(order2);
	}
}
