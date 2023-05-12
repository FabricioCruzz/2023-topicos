package br.edu.univas.si7.topicos.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.topicos.product.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	public boolean findByNameCat(String nameCat);
}