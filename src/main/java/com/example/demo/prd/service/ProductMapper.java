package com.example.demo.prd.service;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
	public int insert(Product prd);
	public List<Product> selectAll();
	public Product selectById(int prdId);
	public int update(Product prd);
	public int delete(Product prd);
}
