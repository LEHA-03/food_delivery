package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Contains;

@Repository
public interface ContainsRepository
        extends ArangoRepository<Contains, String> {

}