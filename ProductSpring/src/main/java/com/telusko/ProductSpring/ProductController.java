package com.telusko.ProductSpring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/list")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/byName/{name}")
	public Product getProduct(@PathVariable("name") String name){
		return service.getProduct(name);
	}
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product p) {
		service.addProducts(p);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProducts(id);
	}	
	
}
