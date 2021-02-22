package com.example.demo.brd.service;

import org.springframework.context.annotation.Lazy;    
import org.springframework.stereotype.Component;
//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Board {
	private int boardNum;
	private String  title, content, writtenDate;


}
