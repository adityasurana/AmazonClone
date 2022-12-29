package com.example.addToCart.Entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="cart")
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue
	public long id;
	
	public UUID productId;
	public UUID userId;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cart(long id, UUID productId, UUID userId) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	
}
