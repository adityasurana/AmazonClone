package com.example.productdetails.Service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productdetails.Entity.Product;
import com.example.productdetails.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public Product saveDatatoDB(Product product) {
		product.setProductId(UUID.randomUUID());
		return productRepo.save(product);
	}
	
	public ArrayList<Product> findAllProducts() {
		return productRepo.findAll();
	}
	
	public Product getProductDetails(UUID productId) {
		return productRepo.findByProductId(productId);
	}
}
