package com.example.productdetails.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productdetails.Entity.Product;
import com.example.productdetails.Service.ProductService;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveDatatoDB(product);
	}
	
	@GetMapping("getAllProducts")
	public ArrayList<Product> getAllProduct() {
		return productService.findAllProducts();
	}
	
	@GetMapping("/search/{productId}")
	public Product getProductById(@PathVariable UUID productId) {
		return productService.getProductDetails(productId);
	}
}
