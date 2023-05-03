package br.edu.univas.si7.topicos.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.topicos.order.entity.SellerEntity;

@Repository
public interface SellerMongoRepository extends MongoRepository<SellerEntity, String> {
}
