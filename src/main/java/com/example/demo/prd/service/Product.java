package com.example.demo.prd.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @Lazy
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int prdId;
	private String prdName, price, inventory;
}