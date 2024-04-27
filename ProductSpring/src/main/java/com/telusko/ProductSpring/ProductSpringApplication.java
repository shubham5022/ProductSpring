package com.telusko.ProductSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class ProductSpringApplication {

	
	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx=SpringApplication.run(ProductSpringApplication.class, args);
		
//		
//		ProductService obj = ctx.getBean(ProductService.class);
//		
//		List<Product> prods =obj.getAllProducts();
//		for(Product b : prods) {
//			System.out.println(b);
//		}
		
	}

}
