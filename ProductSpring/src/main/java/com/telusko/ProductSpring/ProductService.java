package com.telusko.ProductSpring;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ProductService {

	@Autowired
	ProductDB db;
	
	public List<Product> getAllProducts(){
		return db.findAll(); 
	}
	

	public Product getProduct(String name){
		return db.findByName(name); 
	}
	
	public void addProducts(Product p ) {
		db.save(p);
	}
	
	public void deleteProducts(int id ) {
		db.deleteById(id);
	}

}