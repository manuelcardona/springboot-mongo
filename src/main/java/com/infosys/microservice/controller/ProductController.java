package com.infosys.microservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.microservice.repository.document.Product;
import com.infosys.microservice.service.ProductService;

@RestController
@RequestMapping
public class ProductController {

	@Autowired
	ProductService prodService;
	
	@PostMapping("/Nota")
	public boolean addProduct(@RequestBody @Valid Product prodItem) {					
		prodService.add(prodItem);		
		return true;
	}
	
	
	
}
