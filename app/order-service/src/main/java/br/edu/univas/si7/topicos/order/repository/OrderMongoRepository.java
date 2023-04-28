package br.edu.univas.si7.topicos.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.topicos.order.entity.OrderEntity;

@Repository
public interface OrderMongoRepository extends MongoRepository<OrderEntity, Long> {
}
