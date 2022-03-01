package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Client;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {

}
