package com.infosys.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.microservice.repository.ProductRepository;
import com.infosys.microservice.repository.document.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepository;
	
	public boolean add(Product productItem) {
		try {			
			prodRepository.save(productItem);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	
	public boolean update(Product productItem) {
		try {
			prodRepository.save(productItem);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
			
}
