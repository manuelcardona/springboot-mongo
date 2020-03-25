package com.infosys.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infosys.microservice.repository.document.Product;

public interface ProductRepository extends MongoRepository<Product,String> {


}
