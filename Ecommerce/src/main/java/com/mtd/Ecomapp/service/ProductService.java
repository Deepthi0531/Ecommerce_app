package com.mtd.Ecomapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mtd.Ecomapp.repository.ProductRepository;
import com.mtd.Ecomapp.entity.Product;
import java.util.*;


@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public Product saveProduct(Product product) {
		product.setId(null);
		return productRepository.save(product);
	}
	
	public Product getProductById(String id) {
		return productRepository.findById(id).get();
		
	}
	//get all products
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	//delete product from database
	public boolean deleteProduct(String id) {
		Optional<Product> product = productRepository.findById(id);
		if(product.isEmpty()) {
			return false;
		}
		productRepository.deleteById(id);
		return true;
	}
	
	//updating the product
	public Product updateProduct(Product product, String id) {
		Product existingProduct = productRepository.findById(id).get();
		existingProduct.setName(product.getName());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setTags(product.getTags());
		existingProduct.setStock(product.getStock());
		
		return productRepository.save(existingProduct);
		
	}

}
