package com.example.addToCart.Entity;

import java.util.ArrayList;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="cartDetails")
public class CartDetails {
	private UUID userId;
	private ArrayList<Product> list;
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public ArrayList<Product> getList() {
		return list;
	}
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
}
