package com.bank.servis;

import com.bank.model.Client;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceClient {
	 Flux<Client> findAll();
	 Mono<Client> save(Client client);
	 Mono<Client> findProductById(String id);	
	 Mono<Client> update(Client product);
	 void deleteById(String id);
	 
	 
	 //
	 Mono<Client> findClienttById(String id);

}
