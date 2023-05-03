package br.edu.univas.si7.topicos.order.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document(collection = "Orders")
@Data
@AllArgsConstructor
public class OrderEntity {

	@Id
	private Long number;
	private LocalDateTime dateRequest;
	
	@DBRef(lazy = true)
	private SellerEntity seller;
	
}
