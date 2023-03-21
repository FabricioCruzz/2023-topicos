package br.edu.univas.si7.topicos.product.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univas.si7.topicos.product.dto.ProductDTO;
import br.edu.univas.si7.topicos.product.entities.ProductEntity;
import br.edu.univas.si7.topicos.product.repository.ProductRepository;
import br.edu.univas.si7.topicos.product.support.ObjectNotFoundException;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity> getAllProducts() {
		return repo.findAll();
	}

	@GetMapping("/{code}")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDTO getProductById(@PathVariable Integer code) {
		Optional<ProductEntity> obj = repo.findById(code);
//		if (obj.isPresent()) {
//			return obj.get();
//		}
//		throw new ObjectNotFoundException("Product not found: " + code);
		
		ProductEntity entity = obj.orElseThrow(() -> 
			new ObjectNotFoundException("Product " + code + " not found"));
		return new ProductDTO(entity);
	}

	@GetMapping("/active")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductDTO> getAllProductsActive() {
//		List<ProductEntity> listEntity = repo.findByActive(true);
//		List<ProductDTO> listDTO = new ArrayList<>();
//		for (ProductEntity entity : listEntity) {
//			ProductDTO dto = new ProductDTO(entity);
//			listDTO.add(dto);
//		}
//		return listDTO;
		
		return repo.findByActive(true)
			.stream()
			.map(p -> new ProductDTO(p))
			.collect(Collectors.toList());
	}

}
