package com.mtd.Ecomapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtd.Ecomapp.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
