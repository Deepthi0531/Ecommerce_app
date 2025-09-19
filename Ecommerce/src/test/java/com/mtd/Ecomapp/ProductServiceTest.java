package com.mtd.Ecomapp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.*;

import com.mtd.Ecomapp.entity.Product;
import com.mtd.Ecomapp.service.ProductService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ProductService.class)
public class ProductServiceTest {
	@Autowired
	private ProductService service;
	@MockitoBean
	private MockMvc mockMvc;
	
	@Test
	void shouldReturnAllProducts() throws Exception{
		when(service.getProducts()).thenReturn(List.of(new Product("Lenovo","Descriptions","electronics",400,"nothing",50)));
		mockMvc.perform(get("/products/all"))
		.andExpect(status().isOk())
        .andExpect(jsonPath("$[0].name").value("Lenovo"));
	}
}
