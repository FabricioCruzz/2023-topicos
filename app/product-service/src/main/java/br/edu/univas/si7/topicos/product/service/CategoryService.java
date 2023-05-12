package br.edu.univas.si7.topicos.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univas.si7.topicos.product.entities.Category;
import br.edu.univas.si7.topicos.product.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category save(Category category) {
        return repo.saveAndFlush(category);
    }

    public List<Category> findAll() {
        return repo.findAll();
    }

    public Category update(Category category) {
        return repo.saveAndFlush(category);
    }

    public Optional<Category> findById(Integer id) {
        return repo.findById(id);
    }

    @Transactional
    public void delete(Category category) {
        repo.delete(category);
    }

}