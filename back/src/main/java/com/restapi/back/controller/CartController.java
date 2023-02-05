package com.restapi.back.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.back.entity.CartData;
import com.restapi.back.service.impl.CartDataImplementation;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/cart")
public class CartController {
private CartDataImplementation cdi;
//To add new cart
	@PostMapping()
	public ResponseEntity<CartData> saveUser(@RequestBody CartData userdata){
		return new ResponseEntity<CartData>(cdi.saveCart(userdata),HttpStatus.CREATED);
	}
	// an api to get cart details by user id
	@GetMapping("{id}")
	public ResponseEntity<List<CartData>> getbyuser(@PathVariable long userid){
		return new ResponseEntity<List<CartData>>(cdi.getCartByUserid(userid),HttpStatus.OK);
		
	}
}
