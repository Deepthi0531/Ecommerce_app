package com.mtd.Ecomapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.mtd.Ecomapp.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
	
}
