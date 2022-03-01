package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Client;
import com.bank.servis.IServiceClient;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController

@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {
	private final IServiceClient service;
	
	@GetMapping("/findAll")
	public Flux<Client> getClient(){
		return service.findAll();
	}
	
	@PostMapping("/save")
	Mono<Client> postClient(@RequestBody Client client)
	{
		return service.save(client);
	}
	@PostMapping("/update")
	public Mono<Client> saveProduct(@RequestBody Client client){
		
		return service.save(client);
	}
	
	@DeleteMapping("/{id}")
	void deleteProduct(@PathVariable String id){
		
		//service.deleteById(id);
	}
	
	@GetMapping("/findbyid/{id}")
	public Mono<Client> findById(@PathVariable String id){
		return service.findClienttById(id);
	}

}
