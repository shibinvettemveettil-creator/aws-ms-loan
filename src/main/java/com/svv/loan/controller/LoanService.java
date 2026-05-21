package com.svv.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/loan")
public class LoanService {
	
	@Autowired
	private WebClient webClient;
	
	@GetMapping("/test")
	public String test()
	{
		return "Hi";
	}
	
	@GetMapping("/{id}")
	public String getLoanType(@PathVariable int id)
	{
		return webClient.get().uri("bank/type/{id}",id)
				.retrieve()
				.bodyToMono(String.class)
				.block();
	}

}
