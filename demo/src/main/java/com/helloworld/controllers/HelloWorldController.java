package com.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/")
	public ResponseEntity<?> helloWorld(){

		return new ResponseEntity<>("Hola mundo!", HttpStatus.OK);
	}

}
