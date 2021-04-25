package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

	@GetMapping
	public ResponseEntity<?> get(){
		return ResponseEntity.ok("OK");
	}
}
