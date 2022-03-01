package com.bank.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Client;

import com.bank.repository.ClientRepository;


import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
@Service
public class ServisClientImpl implements IServiceClient {
	
	private final ClientRepository repository;

	@Override
	public Flux<Client> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<Client> save(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}
	
	@Override
	public Mono<Client> findProductById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Client> update(Client product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id).subscribe();
	}

	@Override
	public Mono<Client> findClienttById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}


}
