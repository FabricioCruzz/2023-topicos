package br.edu.univas.si7.topicos.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.topicos.product.entities.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	public List<ProductEntity>findByActive(Boolean active);
	
	//TODO: Como criar o findByCategoryName
	// Pesquisar como fazer
	
}