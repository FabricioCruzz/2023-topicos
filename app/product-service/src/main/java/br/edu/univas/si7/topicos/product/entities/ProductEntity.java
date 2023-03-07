package br.edu.univas.si7.topicos.product.entities;

public class ProductEntity {
	
	private int code;
	private String name;
	private float price;
	private boolean active;

	// criar o construtor com todos os parâmetros
	// criar os sets e gets
	public ProductEntity(int code, String name, float price, boolean active) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.active = active;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
