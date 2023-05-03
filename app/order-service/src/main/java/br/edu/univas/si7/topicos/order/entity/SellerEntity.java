package br.edu.univas.si7.topicos.order.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Sellers")
@Data
@NoArgsConstructor
public class SellerEntity {
	@Id
	private String id;
	private String name;
	private String email;

	public SellerEntity(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
