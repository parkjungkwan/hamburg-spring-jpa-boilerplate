package com.example.demo.prd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired ProductMapper productMapper;
	public int add(Product prd) {return productMapper.insert(prd);}
	public int update(Product prd) {return productMapper.update(prd);}
	public int delete(Product prd) {return productMapper.delete(prd);}
}
